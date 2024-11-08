package com.xianyu;

import com.xianyu.pojo.User;
import com.xianyu.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class MyBatisPlusTest {

  @Autowired
  private UserService userService;

  @Test
  public void save() {
    List<User> users = new ArrayList<>();
    User user = new User();
    user.setAge(18);
    user.setName("二狗子");
    users.add(user);
    boolean b = userService.saveBatch(users);
    System.out.println("save: " + b);
  }

  @Test
  public void saveOrUpdate() {
    // 当id有值则为修改，无值为添加
    User user = new User();
    user.setAge(19);
    user.setName("三娃子");
    boolean b = userService.saveOrUpdate(user);
    System.out.println("saveOrUpdate: " + b);

    // User user = new User();
    // user.setAge(19);
    // user.setId(666);
    // user.setName("三娃子");
    // boolean b = userService.saveOrUpdate(user);
    // System.out.println("saveOrUpdate: " + b);
  }

  @Test
  public void remove() {
    boolean b = userService.removeById(129445889);
    System.out.println("remove: " + b);
  }

  @Test
  public void update() {
    User user = new User();
    user.setId(129445889);
    user.setEmail("6666@666.66");
    boolean b = userService.updateById(user);
    System.out.println("update: " + b);
  }

  @Test
  public void getOrList() {
    List<Integer> ids = new ArrayList<>();
    ids.add(129445889);
    List<User> users = userService.listByIds(ids);
    System.out.println("getOrList: " + users);
  }
}
