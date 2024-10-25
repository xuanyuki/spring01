package com.xianyu.mapper;

import com.xianyu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("MybatisXMapperMethodInspection")
public interface EmployeeMapper {
  List<Employee> query(@Param("name") String name, @Param("salary") Double salary);

  int updateById(Employee employee);

  List<Employee> queryChoose(@Param("name") String name, @Param("salary") Double salary);

  // 批量操作
  List<Employee> queryBatch(@Param("ids") List<Integer> ids);

  int deleteBatch(@Param("ids") List<Integer> ids);

  int insertBatch(@Param("employees") List<Employee> employees);

  int updateBatch(@Param("employees") List<Employee> employees);
}
