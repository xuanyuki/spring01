package com.xianyu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan({"com.xianyu.controller", "com.xianyu.exceptionHandler"})
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

  // 静态资源处理
  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

  // 视图解析器

  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    registry.jsp("/WEB-INF/views", "jsp");
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // registry.addInterceptor();
  }
}
