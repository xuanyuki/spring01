package com.example.springaop01.service;

import org.springframework.stereotype.Service;

@Service
public interface Calculator {
  int add(int i, int j);
  int sub(int i, int j);
  int mul(int i, int j);
  int div(int i, int j);
}
