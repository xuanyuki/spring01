package com.xianyu.error;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


// 异常处理
@RestControllerAdvice
public class GlobalException {

  @ExceptionHandler(ArithmeticException.class)
  public Object numberExceptionHandler(ArithmeticException e) {
    String message = e.getMessage();
    System.out.println(message);
    return message;
  }

  @ExceptionHandler(NullPointerException.class)
  public Object nullExceptionHandler(NullPointerException e) {
    String message = e.getMessage();
    System.out.println(message);
    return message;
  }


  @ExceptionHandler(Exception.class)
  public Object allExceptionHandler(Exception e) {
    String message = e.getMessage();
    System.out.println(message);
    return message;
  }
}
