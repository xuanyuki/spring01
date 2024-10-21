package com.xianyu.config;

import org.springframework.beans.factory.annotation.Value;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.xianyu")
@PropertySource("classpath:jdbc.properties")
//@EnableAspectJAutoProxy // 开启AOP
@EnableTransactionManagement // 开启事务
public class JavaConfig {

  @Value("${xianyu.driver}")
  private String driver;

  @Value("${xianyu.url}")
  private String url;

  @Value("${xianyu.username}")
  private String username;

  @Value("${xianyu.password}")
  private String password;


  @Bean
  public DataSource dataSource() {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName(driver);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);
    return dataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource){
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.setDataSource(dataSource);
    return jdbcTemplate;
  }

  @Bean
  public TransactionManager transactionManager(DataSource dataSource){
    return new DataSourceTransactionManager(dataSource);
  }
}
