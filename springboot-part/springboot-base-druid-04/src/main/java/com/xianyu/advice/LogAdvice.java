package com.xianyu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class LogAdvice {

  // 添加切面
  @Before("execution(* com..service.*.*(..))")
  public void before(JoinPoint jp) {
    String className = jp.getTarget().getClass().getSimpleName();
    String functionName = jp.getSignature().getName();
    System.out.println(className + " " + functionName);

  }
}
