package com.xianyu.mapper;

import com.xianyu.pojo.Teacher;

public interface TeacherMapper {
  int insertTeacher(Teacher teacher);

  Teacher queryById(String id);
}
