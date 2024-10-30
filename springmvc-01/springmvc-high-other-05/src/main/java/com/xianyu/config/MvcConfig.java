package com.xianyu.config;

import com.xianyu.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan("com.xianyu.controller")
public class MvcConfig implements WebMvcConfigurer {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // 注册一个拦截器,拦截全部
    // registry.addInterceptor(new MyInterceptor());

    // 精准拦截
    registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/data");

    // 排除拦截
    // registry.addInterceptor(new MyInterceptor()).excludePathPatterns("/user/data1");
  }
}
