package com.example.spring01;

import com.example.spring01.config.JavaConfig;
import com.example.spring01.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

  @Test
  public void test(){
    ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    StudentController controller = context.getBean(StudentController.class);
    controller.findAll();
  }
}
