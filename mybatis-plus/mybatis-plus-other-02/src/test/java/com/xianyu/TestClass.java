package com.xianyu;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xianyu.mapper.UserMapper;
import com.xianyu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestClass {
  @Autowired
  private UserMapper mapper;

  @Test
  public void testPage() {
    Page<User> page = new Page<>(1, 3);
    mapper.selectPage(page, null);

    long current = page.getCurrent();
    long size = page.getSize();
    long pages = page.getPages();
    List<User> records = page.getRecords();
    long total = page.getTotal();

    // 输出
    System.out.println("当前页：" + current);
    System.out.println("每页显示条数：" + size);
    System.out.println("总页数：" + pages);
    System.out.println("总记录数：" + total);
    System.out.println("当前页数据：" + records);
  }

  @Test
  public void testMyPage() {
    Page<User> page = new Page<>(1, 3);
    mapper.queryByAge(page, 5);

    long current = page.getCurrent();
    long size = page.getSize();
    long pages = page.getPages();
    List<User> records = page.getRecords();
    long total = page.getTotal();

    // 输出
    System.out.println("当前页：" + current);
    System.out.println("每页显示条数：" + size);
    System.out.println("总页数：" + pages);
    System.out.println("总记录数：" + total);
    System.out.println("当前页数据：" + records);
  }

}
