package com.xianyu;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.xianyu.mapper.UserMapper;
import com.xianyu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class LambdaQueryWrapperTest {

  @Autowired
  private UserMapper userMapper;

  @Test
  public void test01() {
    // QueryWrapper<User> wrapper = new QueryWrapper<>();
    // wrapper.like("name", "王")
    //         .between("age", 10, 50)
    //         .isNotNull("email");

    LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    lambdaQueryWrapper.like(User::getName, "a")
            .between(User::getAge, 10, 50)
            .isNotNull(User::getEmail);

    List<User> users = userMapper.selectList(lambdaQueryWrapper);
    System.out.println(users);
  }

  @Test
  public void test02() {
    LambdaUpdateWrapper<User> wrapper = new LambdaUpdateWrapper<>();
    wrapper.gt(User::getAge, 20)
            .like(User::getName, "王")
            .or()
            .isNull(User::getEmail)
            .set(User::getEmail, "aaa@aa.aa");
    int rows = userMapper.update(wrapper);
    System.out.println(rows);
  }

}
