package com.spring.source.code.jdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * 基于注解式的开发
 */
@Component
@ComponentScan(basePackages = {"com.spring.source.code.jdbcTemplate"})
@PropertySource("classpath:jdbc.properties")   // 读取配置
public class JdbcTemplateSpringConfig {


    @Value("${prop.url}")
    private String url;

    @Value("${prop.username}")
    private String username;

    @Value("${prop.password}")
    private String password;

    @Value("${prop.driverClass}")
    private String driverClassName;


    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setDriverClassName(driverClassName);
        return druidDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
