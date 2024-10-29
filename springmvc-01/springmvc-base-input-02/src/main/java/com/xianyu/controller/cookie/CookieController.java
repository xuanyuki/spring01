package com.xianyu.controller.cookie;

import com.xianyu.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("cookie")
public class CookieController {

  @RequestMapping("data")
  public String data(@CookieValue("cookieName") String value, @RequestBody Person p){
    System.out.println(value+" "+p);
    return value+" "+p.toString();
  }
}
