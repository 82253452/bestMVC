package com.example.conf;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

@Configuration
public class XATransactionManagerConfig {

    @Bean(name = "userTransaction")
    public UserTransactionImp userTransaction() throws Throwable {
        UserTransactionImp userTransactionImp = new UserTransactionImp();
        userTransactionImp.setTransactionTimeout(10000);
        return userTransactionImp;
    }

    @Bean(name = "atomikosTransactionManager", initMethod = "init", destroyMethod = "close")
    public UserTransactionManager atomikosTransactionManager() throws Throwable {
        UserTransactionManager userTransactionManager = new UserTransactionManager();
        userTransactionManager.setForceShutdown(true);
        return userTransactionManager;
    }

    @Bean(name = "transactionManager")
    @Primary
    @DependsOn({"userTransaction", "atomikosTransactionManager"})
    public JtaTransactionManager transactionManager() throws Throwable {
        JtaTransactionManager transactionManager = new JtaTransactionManager(userTransaction(), atomikosTransactionManager());
        transactionManager.setAllowCustomIsolationLevels(true);
        return transactionManager;
    }

}