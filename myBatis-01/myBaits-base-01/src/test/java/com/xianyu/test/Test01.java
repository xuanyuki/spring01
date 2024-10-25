package com.xianyu.test;


import com.xianyu.mapper.EmployeeMapper;
import com.xianyu.pojo.Employee;
import com.xianyu.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {

//  mybatis
  @Test
  public void test01() throws IOException {

    InputStream inputStream = Resources.getResourceAsStream("mybaits-config.xml");

    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

    Employee employee = mapper.queryById(1);
    System.out.println(employee);

    sqlSession.commit();
    sqlSession.close();
  }

//  ibatis方式
  @Test
  public void test02() throws IOException {
    InputStream inputStream = Resources.getResourceAsStream("mybaits-config.xml");

    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    Student student = sqlSession.selectOne("student.queryById", 1);
    System.out.println(student);
    sqlSession.commit();
    sqlSession.close();
  }
}
