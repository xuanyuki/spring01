package com.xianyu.pojo;

import org.apache.ibatis.type.Alias;

public class Employee {
  private Integer empId;

  private String empName;

  private Double empSalary;


  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public Double getEmpSalary() {
    return empSalary;
  }

  public void setEmpSalary(Double empSalary) {
    this.empSalary = empSalary;
  }

  public String toString() {
    return  "empName=" + empName + ", empSalary=" + empSalary;
  }
}
