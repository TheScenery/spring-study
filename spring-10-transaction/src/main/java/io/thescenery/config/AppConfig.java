package io.thescenery.config;

import io.thescenery.dao.UserMapperImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@MapperScan("io.thescenery.mapper")
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource("jdbc:mysql://localhost:3306/mybatis", "root", "123456");
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }

//    @Bean
//    public MapperFactoryBean<UserMapper> userMapper() throws Exception {
//        MapperFactoryBean<UserMapper> userMapper = new MapperFactoryBean<>(UserMapper.class);
//        userMapper.setSqlSessionFactory(sqlSessionFactory());
//        return userMapper;
//    }

    @Bean
    public UserMapperImpl userMapperImpl() throws Exception {
        UserMapperImpl userMapper = new UserMapperImpl();
        userMapper.setSqlSessionFactory(sqlSessionFactory());
        return userMapper;
    }
}
