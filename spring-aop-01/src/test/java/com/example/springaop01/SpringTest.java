package com.example.springaop01;

import com.example.springaop01.config.JavaConfig;
import com.example.springaop01.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value= JavaConfig.class)
public class SpringTest {

  @Autowired
  private Calculator calculator;

  @Test
  public void test() {
    System.out.println(calculator.div(1, 0));
    System.out.println(calculator.mul(1, 2));

  }

}
