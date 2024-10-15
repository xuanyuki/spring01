package com.example.springaop01.advice;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10) // 指定优先级，值越大优先级越低
public class TxAdvice {

  @Around("com.example.springaop01.pointcut.MyPointcut.pc()")
  public Object transaction(ProceedingJoinPoint jp) {
    Object[] args = jp.getArgs();
    Object res = null;

    try {
      System.out.println("开启事务");
      res = jp.proceed();
      System.out.println("结束事务");
    } catch (Throwable t) {
      System.out.println("事务回滚");
      throw new RuntimeException(t);
    } finally {
      System.out.println("最终处理");
    }
    return res;
  }
}
