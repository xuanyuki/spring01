package com.example.springaop01.impl;

import com.example.springaop01.service.Calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
  @Override
  public int add(int i, int j) {
    return i + j;
  }

  @Override
  public int sub(int i, int j) {
    return i - j;
  }

  @Override
  public int mul(int i, int j) {
    return i * j;
  }

  @Override
  public int div(int i, int j) {
    return i / j;
  }
}
