package com.xianyu.mapper;

import com.xianyu.pojo.User;

import java.util.List;

public interface UserMapper {
  List<User> queryAll();

  int delete(Integer id);
}
