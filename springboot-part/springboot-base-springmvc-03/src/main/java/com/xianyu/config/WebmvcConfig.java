package com.xianyu.config;

import com.xianyu.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebmvcConfig implements WebMvcConfigurer {

  @Autowired
  private MyInterceptor myInterceptor;

  // 添加拦截器
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(myInterceptor).addPathPatterns("/**");
  }
}
