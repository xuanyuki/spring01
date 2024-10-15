package com.example.springaop01.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {

  @Before("com.example.springaop01.pointcut.MyPointcut.pc()")
  public void start(JoinPoint jp) {
//    获取类信息
    String simpleName = jp.getTarget().getClass().getSimpleName();
//    获取方法信息
    String name = jp.getSignature().getName();
//    获取参数信息
    Object[] args = jp.getArgs();

    System.out.println("start: " + simpleName + "." + name + "(" + args.toString() + ")");
  }

  @AfterReturning(value = "com.example.springaop01.pointcut.MyPointcut.pc()", returning = "rst")
  public void afterReturning(JoinPoint jp, Object rst) {

  }

  @After("com.example.springaop01.pointcut.MyPointcut.pc()")
  public void after(JoinPoint jp) {

  }

  @AfterThrowing(value = "com.example.springaop01.pointcut.MyPointcut.pc()", throwing = "t")
  public void afterThrowing(JoinPoint jp, Throwable t) {

  }
}
