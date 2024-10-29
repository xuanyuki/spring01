package com.xianyu.controller.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("header")
@Controller
public class HeaderController {

  @GetMapping("data")
  public String data(@RequestHeader("host") String host) {
    return host;
  }
}
