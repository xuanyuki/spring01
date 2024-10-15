package com.example.springaop01.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointcut {

  @Pointcut("execution(* com..impl.*.*(..))")
  public void pc(){}

  public void myPc(){

  }

}
