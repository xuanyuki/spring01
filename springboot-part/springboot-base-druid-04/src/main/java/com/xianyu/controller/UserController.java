package com.xianyu.controller;

import com.xianyu.mapper.UserMapper;
import com.xianyu.pojo.User;
import com.xianyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

  // @Autowired
  // private JdbcTemplate jdbcTemplate;
  //
  // @GetMapping("list")
  // public List<User> list() {
  //   String sql = "select * from user";
  //   List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
  //   return query;
  // }

  @Autowired
  private UserMapper userMapper;

  @GetMapping("query")
  public List<User> query() {
    return userMapper.queryAll();
  }

  @Autowired
  private UserService userService;

  @GetMapping("delete")
  public int delete(Integer id){
    Integer rows = userService.delete(id);
    return rows;
  }
}
