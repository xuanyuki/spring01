package com.xianyu.mapper;

import com.xianyu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
  Employee queryById(Integer id);

  int deleteById(Integer id);

  Employee queryByName(String Name);

  int insertEmployee(Employee employee);

  List<Employee> queryByNameAndSalary(@Param("name") String name, @Param("salary") Double salary);

  int addEmployee(Map emp);
}
