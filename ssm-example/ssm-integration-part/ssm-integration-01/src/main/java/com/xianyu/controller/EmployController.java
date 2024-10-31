package com.xianyu.controller;

import com.xianyu.pojo.Employee;
import com.xianyu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmployController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("find")
  public List<Employee> find() {
    List<Employee> all = employeeService.findAll();
    return all;
  }
}


