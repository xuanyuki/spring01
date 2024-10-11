package com.example.spring01.dao;

import com.example.spring01.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public List<Student> queryAll() {
    String sqlStr = """
            Select id,name,age,gender,class as classes from students;
            """;
    List<Student> rows = jdbcTemplate.query(sqlStr, new BeanPropertyRowMapper<>(Student.class));
    return rows;
  }
}
