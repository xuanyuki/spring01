package com.xianyu.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xianyu.pojo.User;


public interface UserMapper extends BaseMapper<User> {
  @Override
  int insert(User entity);
}
