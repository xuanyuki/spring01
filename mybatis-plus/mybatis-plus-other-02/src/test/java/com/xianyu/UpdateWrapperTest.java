package com.xianyu;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.xianyu.mapper.UserMapper;
import com.xianyu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UpdateWrapperTest {

  @Autowired
  private UserMapper userMapper;

  @Test
  public void test01() {
    UpdateWrapper<User> wrapper = new UpdateWrapper<>();

    wrapper.gt("age", 30)
            .like("name", "王")
            .set("email", null)
            .set("age", 52);

    int rows = userMapper.update(wrapper);
    System.out.println(rows);
  }
}
