package com.example.conf;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "com.example.mapper.base2", sqlSessionTemplateRef = "secondarySqlSessionTemplate")
public class DataSourceSecondaryConfig {
    @Autowired
    private Environment env;

    @Bean(name = "secondaryDataSource")
    public DataSource secondaryDataSource() {
//        DruidXADataSource druidXADataSource = new DruidXADataSource();
//        druidXADataSource.setUrl(env.getProperty("spring.datasource.secondary.url"));
//        druidXADataSource.setUsername(env.getProperty("spring.datasource.secondary.username"));
//        druidXADataSource.setPassword(env.getProperty("spring.datasource.secondary.password"));
//        druidXADataSource.setDriverClassName(env.getProperty("spring.datasource.secondary.driver-class-name"));

        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        Properties properties = new Properties();
        properties.put("url", env.getProperty("spring.datasource.secondary.url"));
        properties.put("user", env.getProperty("spring.datasource.secondary.username"));
        properties.put("password", env.getProperty("spring.datasource.secondary.password"));
        properties.put("pinGlobalTxToPhysicalConnection", "true");
        properties.put("autoReconnect", "true");
        properties.put("autoReconnectForConnectionPools", "true");
        properties.put("autoReconnectForPools", "true");
        xaDataSource.setXaProperties(properties);

        xaDataSource.setXaDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlXADataSource");
        xaDataSource.setUniqueResourceName("secondaryDataSourceName");
        xaDataSource.setMaxPoolSize(env.getProperty("spring.datasource.pool.maxPoolSize", Integer.class));
        xaDataSource.setMinPoolSize(env.getProperty("spring.datasource.pool.minPoolSize", Integer.class));
        xaDataSource.setBorrowConnectionTimeout(env.getProperty("spring.datasource.pool.borrowConnectionTimeout", Integer.class));
        xaDataSource.setMaintenanceInterval(env.getProperty("spring.datasource.pool.maintenanceInterval", Integer.class));
        xaDataSource.setMaxIdleTime(env.getProperty("spring.datasource.pool.maxIdleTime", Integer.class));
        xaDataSource.setMaxLifetime(env.getProperty("spring.datasource.pool.maxLifetime", Integer.class));
        xaDataSource.setTestQuery(env.getProperty("spring.datasource.pool.testQuery"));
        return xaDataSource;
    }

    @Bean(name = "secondarySqlSessionFactory")
    public SqlSessionFactory secondarySqlSessionFactory(@Qualifier("secondaryDataSource") DataSource dataSource,
                                                        @Qualifier("mapperHelperSecondary") MapperHelper mapperHelper) throws Exception {
        tk.mybatis.mapper.session.Configuration configuration = new tk.mybatis.mapper.session.Configuration();
        configuration.setMapperHelper(mapperHelper);
        configuration.setLogImpl(org.apache.ibatis.logging.stdout.StdOutImpl.class);
        configuration.setUseGeneratedKeys(true);
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setConfiguration(configuration);
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/base2/*.xml"));//指定mapper.xml路径
//        Interceptor[] plugins = new Interceptor[]{pageInterceptor};
//        bean.setPlugins(plugins);
        return bean.getObject();
    }

    @Bean(name = "secondaryTransactionManager")
    public DataSourceTransactionManager secondaryTransactionManager(@Qualifier("secondaryDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "secondarySqlSessionTemplate")
    public SqlSessionTemplate secondarySqlSessionTemplate(@Qualifier("secondarySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "mapperHelperSecondary")
    public MapperHelper mapperHelperSecondary() {
        MapperHelper mapperHelper = new MapperHelper();
        Config config = new Config();
        config.setWrapKeyword("`{0}`");
        config.setIDENTITY("MYSQL");
        config.setOrder("AFTER");
        mapperHelper.setConfig(config);
        return mapperHelper;
    }

}
