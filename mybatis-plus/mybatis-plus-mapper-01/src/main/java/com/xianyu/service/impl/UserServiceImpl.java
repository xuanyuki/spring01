package com.xianyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xianyu.mapper.UserMapper;
import com.xianyu.pojo.User;
import com.xianyu.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl< UserMapper,User> implements UserService   {


}
