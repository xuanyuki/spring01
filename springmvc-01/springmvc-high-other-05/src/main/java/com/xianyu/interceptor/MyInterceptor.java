package com.xianyu.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {


  // 执行handler之前
  // 返回true标识放行，false表示拦截
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    System.out.println("之前");
    return true;
  }


  // handler执行完毕后
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                         ModelAndView modelAndView //视图和共享域数据
  ) throws Exception {
    System.out.println("之后");
    HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
  }

  // 整体处理完毕
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    System.out.println("全部");
    HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
  }
}
