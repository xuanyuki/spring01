package com.xianyu.controller.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("path")
public class PathController {

  @GetMapping("{account}/{password}")
  public String login(@PathVariable("account") String account, @PathVariable("password") String password) {
    System.out.println(account+" "+password);
    return account+" "+password;
  }
}
