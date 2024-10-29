package com.xianyu.controller.param;

import com.xianyu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("param")
public class ParamController {
  /**
   * 直接接收参数
   */
  @RequestMapping("data")
  @ResponseBody
  public String data(@RequestParam("name") String name, @RequestParam("age") int age) {
    System.out.println("name: " + name + " age: " + age);
    return "name: " + name + " age: " + age;
  }

  /**
   * name 传参名称
   * defaultValue 默认值
   * required 是否必传
   */
  @GetMapping("data1")
  @ResponseBody
  public String data1(@RequestParam("account") String account,
                      @RequestParam(defaultValue = "1", required = false, name = "page") Integer page) {
    return account + " " + page;
  }


  @GetMapping("data2")
  @ResponseBody
  public String data2(@RequestParam("hbs") List<String> hbs) {

    System.out.println(hbs.get(0));
    return hbs.get(0) + " " + hbs.get(1);
  }

  @ResponseBody
  @GetMapping("data3")
  public String data3(User user) {
    System.out.println(user);
    return user.toString();
  }
}
