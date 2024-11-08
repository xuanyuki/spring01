package com.xianyu;

import com.xianyu.mapper.UserMapper;
import com.xianyu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VersionTest {

  @Autowired
  private UserMapper userMapper;

  @Test
  public void test01(){
    User user = userMapper.selectById(3);
    User user1 = userMapper.selectById(3);
    user.setAge(5);
    user1.setAge(10);

    userMapper.updateById(user);
    // 此次更新会失败
    userMapper.updateById(user1);
  }
}
