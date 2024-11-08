package com.xianyu.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xianyu.pojo.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper extends BaseMapper<User> {

  // 自定义分页查询
  public IPage<User> queryByAge(IPage<User> page, @Param("age") Integer age);

}
