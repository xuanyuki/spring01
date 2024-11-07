package com.xianyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    // 自动启动tomcat，自动创建ioc
    SpringApplication.run(Main.class, args);
  }
}
