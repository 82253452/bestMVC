package com.example.conf;

import bitronix.tm.BitronixTransactionManager;
import bitronix.tm.BitronixUserTransactionObjectFactory;
import bitronix.tm.TransactionManagerServices;
import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.jta.JtaTransactionManager;

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

    @Bean(name = "btmConfig")
    bitronix.tm.Configuration transactionManagerServices() {
        return TransactionManagerServices.getConfiguration().setServerId("spring-btm");
    }


    @Bean(name = "bitronixTransactionManager")
    @DependsOn("btmConfig")
    BitronixTransactionManager bitronixTransactionManager() {
        return TransactionManagerServices.getTransactionManager();
    }


    @Bean(name = "transactionManager")
    @Primary
//    @DependsOn({"userTransaction", "atomikosTransactionManager"})
    public JtaTransactionManager transactionManager(BitronixTransactionManager bitronixTransactionManager) throws Throwable {
        JtaTransactionManager transactionManager = new JtaTransactionManager(bitronixTransactionManager, bitronixTransactionManager);
        transactionManager.setAllowCustomIsolationLevels(true);
        return transactionManager;
    }

}