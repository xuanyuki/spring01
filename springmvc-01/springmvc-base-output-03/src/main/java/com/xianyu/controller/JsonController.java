package com.xianyu.controller;

import com.xianyu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // 等价于 @ResponseBody + @Controller
@RequestMapping("json")
public class JsonController {


  @GetMapping("data")
  public User data() {
    User u = new User();
    u.setName("zhangsan");
    u.setAge(18);
    return u;
  }

  @GetMapping("data1")
  public List<User> data1() {
    User u = new User();
    u.setName("李四");
    u.setAge(16);
    List<User> us = new ArrayList<>();
    us.add(u);
    return us;
  }
}
