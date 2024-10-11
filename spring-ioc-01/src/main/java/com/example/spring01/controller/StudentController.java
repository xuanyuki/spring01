package com.example.spring01.controller;

import com.example.spring01.pojo.Student;
import com.example.spring01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

  @Autowired
  private StudentService studentService;

  public void findAll() {
    List<Student> list = studentService.findAll();
    list.forEach(System.out::println);
  }
}
