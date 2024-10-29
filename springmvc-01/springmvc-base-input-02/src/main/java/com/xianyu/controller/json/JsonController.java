package com.xianyu.controller.json;

import com.xianyu.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("json")
@Controller
public class JsonController {

  @PostMapping("data")
  public String data(@RequestBody Person person) {
    System.out.println(person);
    return person.toString();
  }
}
