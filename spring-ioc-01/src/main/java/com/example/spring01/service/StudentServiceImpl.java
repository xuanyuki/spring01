package com.example.spring01.service;

import com.example.spring01.dao.StudentDao;
import com.example.spring01.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentServiceImpl implements StudentService{

  @Autowired
  private StudentDao studentDao;

  @Override
  public List<Student> findAll() {
    return studentDao.queryAll();
  }
}
