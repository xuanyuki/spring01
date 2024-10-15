package com.example.springaop01.advice;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(11)
public class LogAdvice {

  @Before(value="execution(* com.example.springaop01.impl.*.*(..))")
  public void startLog() {
    System.out.println("开始");
  }

  @After(value="execution(* com.example.springaop01.impl.*.*(..))")
  public void afterLog() {
    System.out.println("结束");
  }

  @AfterThrowing(value="execution(* com.example.springaop01.impl.*.*(..))")
  public void errorLog() {
    System.out.println("报错了");
  }
}
