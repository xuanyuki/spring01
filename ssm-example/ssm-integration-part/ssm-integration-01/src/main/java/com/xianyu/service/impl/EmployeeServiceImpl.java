package com.xianyu.service.impl;

import com.xianyu.mapper.EmployMapper;
import com.xianyu.pojo.Employee;
import com.xianyu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployMapper employMapper;

  @Override
  public List<Employee> findAll() {
    List<Employee> employees = employMapper.queryList();
    return employees;
  }
}
