package com.xianyu.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// 加载ioc容器配置类
public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[0];
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[]{MvcConfig.class};
  }

  // 配置servlet访问地址
  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }
}
