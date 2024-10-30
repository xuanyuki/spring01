package com.xianyu.controller;

import com.xianyu.pojo.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

  @PostMapping("register")
  public Object register(@RequestBody @Validated User user, BindingResult br) {
    if (br.hasErrors()) {
      // 当发生error时自定义返回信息
      Map data = new HashMap();
      data.put("code", 400);
      data.put("message", "参数错误");
      return data;
    }
    System.out.println("user: " + user);
    return user;
  }

  @GetMapping("data")
  public String data() {
    String s = null;
    s.toString();
    System.out.println("data");
    return "aa";
  }

  @GetMapping("data1")
  public String data1() {
    Integer a = 1 / 0;
    System.out.println("data1");
    return a.toString();
  }

}
