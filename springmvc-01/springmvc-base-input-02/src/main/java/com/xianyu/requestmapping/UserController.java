package com.xianyu.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user") // 指定类中所有方法的前置访问地址
public class UserController {

  // RequestMapping注解不加参数表示访问地址为类的路径地址，此处为/user
  @RequestMapping
  public String index() {
    return null;
  }

  @PostMapping("/login")
  public String login() {
    return null;
  }

  @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
  public String register() {
    return null;
  }
}
