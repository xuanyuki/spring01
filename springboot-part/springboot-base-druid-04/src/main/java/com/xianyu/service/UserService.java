package com.xianyu.service;

import com.xianyu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  // 添加事务
  @Transactional
  public Integer delete(Integer id){
    int rows = userMapper.delete(id);
    // int a=2/0;
    System.out.println("删除: "+rows);
    return rows;
  }
}
