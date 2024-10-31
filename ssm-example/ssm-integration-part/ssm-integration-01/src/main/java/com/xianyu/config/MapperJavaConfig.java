package com.xianyu.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@Configuration
public class MapperJavaConfig {


  @Bean
  public SqlSessionFactoryBean sessionFactoryBean() {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    Resource resource = new ClassPathResource("mybatis-config.xml");
    bean.setConfigLocation(resource);
    return bean;
  }

  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer configurer = new MapperScannerConfigurer();
    configurer.setBasePackage("com.xianyu.mapper");
    return configurer;
  }
}
