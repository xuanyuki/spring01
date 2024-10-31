package com.xianyu.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
public class MapperJavaConfigNew {


  @Bean
  public SqlSessionFactoryBean sessionFactoryBean(DataSource dataSource) {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);

    org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
    config.setMapUnderscoreToCamelCase(true);
    config.setLogImpl(Slf4jImpl.class);
    config.setAutoMappingBehavior(AutoMappingBehavior.FULL);


    bean.setConfiguration(config);
    bean.setTypeAliasesPackage("com.xianyu.pojo");

    PageInterceptor pageInterceptor = new PageInterceptor();
    Properties properties = new Properties();
    properties.setProperty("helperDialect", "mysql");
    pageInterceptor.setProperties(properties);
    bean.addPlugins(pageInterceptor);

    return bean;
  }

  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer configurer = new MapperScannerConfigurer();
    configurer.setBasePackage("com.xianyu.mapper");
    return configurer;
  }
}
