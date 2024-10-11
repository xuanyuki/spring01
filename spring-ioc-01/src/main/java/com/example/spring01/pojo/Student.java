package com.example.spring01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
  private Integer id;
  private String name;
  private String gender;
  private Integer age;
  private String classes;

  @Override
  public String toString() {
    return name + " " + age + " " + gender + " " + classes;
  }
}
