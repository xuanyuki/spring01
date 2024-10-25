package com.xianyu.mapper;

import com.xianyu.pojo.Employee;

public interface EmployeeMapper {
  Employee queryById(Integer id);

  int deleteById(Integer id);
}
