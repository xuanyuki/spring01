package com.xianyu.service;

import com.xianyu.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

@Service
@Transactional // 使类的所有方法获得事务
public class StudentService {
  @Autowired
  private StudentDao studentDao;


  @Transactional(timeout = 3,// 设置超时时间，默认永远不超时
          rollbackFor = Exception.class, // 指定事务回滚的异常
          noRollbackFor = FileNotFoundException.class // 指定事务不回滚的异常
  )
  public void changeInfo() {
    studentDao.updateAgeById(200, 1);
//    int i = 1 / 0;
    System.out.println("------------");
    studentDao.updateNameById("张五", 1);
  }

  @Transactional(readOnly = true) // 只读模式
  public void getStudentInfoById(Integer id) {
    String sql = "Select * from student where id=?";
  }
}
