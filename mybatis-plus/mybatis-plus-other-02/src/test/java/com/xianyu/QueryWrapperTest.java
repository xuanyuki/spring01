package com.xianyu;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xianyu.mapper.UserMapper;
import com.xianyu.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class QueryWrapperTest {
  @Autowired
  private UserMapper userMapper;

  @Test
  public void test01() {
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    wrapper.like("name", "王")
            .between("age", 10, 50)
            .isNotNull("email");
    List<User> users = userMapper.selectList(wrapper);
    System.out.println(users);
  }

  // 排序
  @Test
  public void test02() {
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    wrapper.orderByDesc("age").orderByAsc("id");
    List<User> users = userMapper.selectList(wrapper);
    System.out.println(users);
  }

  // 删除
  @Test
  public void test03() {
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    wrapper.isNull("email");
    int i = userMapper.delete(wrapper);
    System.out.println(i);
  }

  // or
  @Test
  public void Test04() {
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    wrapper.gt("age", 20)
            .like("name", "王")
            .or()
            .isNull("email");
    User user = new User();
    user.setAge(95);
    user.setEmail("pppppp");
    int rows = userMapper.update(wrapper);
    System.out.println(rows);
  }

  // 指定列查询
  @Test
  public void text05() {
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    wrapper.select("id", "name", "age");
    List<User> users = userMapper.selectList(wrapper);
    System.out.println(users);
  }

  // 条件判断
  @Test
  public void text06() {
    String name = "张三";
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    // if (StringUtils.isNotBlank(name)) {
    //   wrapper.eq("name", name)
    // }
    wrapper.eq(StringUtils.isNotBlank(name), "name", name);
    List<User> users = userMapper.selectList(wrapper);
    System.out.println(users);
  }
}

