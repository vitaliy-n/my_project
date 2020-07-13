package com.cheba00.config;


import com.cheba00.dao.impl.UserDaoImpl;
import com.cheba00.dao.interf.IUserDao;
import com.cheba00.services.IUserService;
import com.cheba00.services.UserServiceImpl;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource(value = {"classpath:config.properties"})
@ComponentScan(basePackages = "com.cheba00")
public class SpringConfig {

    @Autowired
    public Environment environment;


    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("db.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("db.url"));
        dataSource.setUsername(environment.getRequiredProperty("db.userName"));
        dataSource.setPassword(environment.getRequiredProperty("db.userPassword"));
        return dataSource;
    }

    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) throws Exception {
        Properties properties = new Properties();

        // See: application.properties
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.autoReconnect", environment.getRequiredProperty("hibernate.autoReconnect"));
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

        // Package contain entity classes
        factoryBean.setPackagesToScan("com.cheba00.models");
        factoryBean.setDataSource(dataSource);
        factoryBean.setHibernateProperties(properties);
        factoryBean.afterPropertiesSet();



        return factoryBean.getObject();
    }



    @Bean(name = "txManager")
    @Autowired
    public PlatformTransactionManager hibernateTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory);
        return transactionManager;
    }

    @Bean(name = "userDao")
    public IUserDao userDao() {
        return new UserDaoImpl();
    }

    @Bean(name = "userService")
    public IUserService userService() {
        return new UserServiceImpl();
    }
}
