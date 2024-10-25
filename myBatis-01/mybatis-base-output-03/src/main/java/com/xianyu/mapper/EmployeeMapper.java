package com.xianyu.mapper;


import com.xianyu.pojo.Employee;

import java.util.List;
import java.util.Map;

@SuppressWarnings("MybatisXMapperMethodInspection")
public interface EmployeeMapper {
  //  根据id查询姓名
  String queryNameById(Integer id);

  Double querySalaryById(Integer id);

  Employee queryById(Integer id);

  Map<String, Object> selectEmpNameAndMaxSalary();

  //  查询工资高于数值的员工姓名
  List<String> queryNamesBySalary(Double salary);

  List<Employee> queryAll();

  int insertEmp(Employee employee);
}
