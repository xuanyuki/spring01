package com.xianyu.controller;

import com.xianyu.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

  @GetMapping
  public List<User> page(@RequestParam(value = "page", required = false, defaultValue = "1") int page,
                         @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
    return null;
  }

  @PostMapping
  public User save(@RequestBody User user) {
    return user;
  }

  @GetMapping("{id}")
  public User detail(@PathVariable Integer id) {
    return null;
  }

  @PutMapping
  public User update(@RequestBody User user) {
    return user;
  }

  @DeleteMapping("{id}")
  public String remove(@PathVariable Integer id) {
    return null;
  }

  @GetMapping("search")
  public List<User> query(
          @RequestParam(value = "page", required = false, defaultValue = "1") int page,
          @RequestParam(value = "size", required = false, defaultValue = "10") int size,
          String keyword
  ) {
    return null;
  }
}
