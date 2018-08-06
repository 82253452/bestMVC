package com.example.conf;

import bitronix.tm.jndi.BitronixInitialContextFactory;
import bitronix.tm.resource.jdbc.PoolingDataSource;
import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.microsoft.sqlserver.jdbc.SQLServerXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "com.example.mapper.base", sqlSessionTemplateRef = "primarySqlSessionTemplate")
public class DataSourcePrimaryConfig {
    @Autowired
    private Environment env;

    @Bean(name = "primaryDataSource")
    @Primary
    public DataSource primaryDataSource() {
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        Properties properties = new Properties();
        properties.put("serverName", env.getProperty("spring.datasource.primary.serverName"));
        properties.put("databaseName", env.getProperty("spring.datasource.primary.databaseName"));
        properties.put("user", env.getProperty("spring.datasource.primary.username"));
        properties.put("password", env.getProperty("spring.datasource.primary.password"));
        properties.put("loginTimeout", "60");
        properties.put("lockTimeout", "-1");
        xaDataSource.setXaProperties(properties);
        xaDataSource.setXaDataSourceClassName("com.microsoft.sqlserver.jdbc.SQLServerXADataSource");
        xaDataSource.setUniqueResourceName("primarySourceName");
        xaDataSource.setMaxPoolSize(env.getProperty("spring.datasource.pool.maxPoolSize",Integer.class));
        xaDataSource.setMinPoolSize(env.getProperty("spring.datasource.pool.minPoolSize",Integer.class));
        xaDataSource.setBorrowConnectionTimeout(env.getProperty("spring.datasource.pool.borrowConnectionTimeout",Integer.class));
        xaDataSource.setMaintenanceInterval(env.getProperty("spring.datasource.pool.maintenanceInterval",Integer.class));
        xaDataSource.setMaxIdleTime(env.getProperty("spring.datasource.pool.maxIdleTime",Integer.class));


        PoolingDataSource poolingDataSource  = new PoolingDataSource();
        poolingDataSource.setClassName("com.microsoft.sqlserver.jdbc.SQLServerXADataSource");
        poolingDataSource.setDriverProperties(properties);
        poolingDataSource.setUniqueName("rrrrrrrr");
        poolingDataSource.setMinPoolSize(10);
        poolingDataSource.setMaxPoolSize(100);
        poolingDataSource.setMaxIdleTime(60);
        poolingDataSource.setAcquisitionTimeout(60);
        poolingDataSource.setApplyTransactionTimeout(true);
        poolingDataSource.setAllowLocalTransactions(true);


        return poolingDataSource;
    }

    @Bean(name = "primarySqlSessionFactory")
    public SqlSessionFactory primarySqlSessionFactory(@Qualifier("primaryDataSource") DataSource dataSource,
                                                      @Qualifier("mapperHelperPrimary") MapperHelper mapperHelper) throws Exception {
        tk.mybatis.mapper.session.Configuration configuration = new tk.mybatis.mapper.session.Configuration();
        configuration.setMapperHelper(mapperHelper);
        configuration.setLogImpl(org.apache.ibatis.logging.stdout.StdOutImpl.class);
        configuration.setUseGeneratedKeys(true);
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setConfiguration(configuration);
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/base/*.xml"));//指定mapper.xml路径
        return bean.getObject();
    }

    @Bean(name = "primaryTransactionManager")
    public DataSourceTransactionManager primaryTransactionManager(@Qualifier("primaryDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "primarySqlSessionTemplate")
    @Primary
    public SqlSessionTemplate primarySqlSessionTemplate(@Qualifier("primarySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "mapperHelperPrimary")
    public MapperHelper mapperHelperPrimary() {
        MapperHelper mapperHelper = new MapperHelper();
        Config config = new Config();
        config.setWrapKeyword("[{0}]");
        config.setIDENTITY("SQLSERVER");
        config.setOrder("AFTER");
        mapperHelper.setConfig(config);
        return mapperHelper;
    }
}
