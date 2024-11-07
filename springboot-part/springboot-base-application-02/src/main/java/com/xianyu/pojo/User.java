package com.xianyu.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

// 读取配置文件
@Data
@Component
@ConfigurationProperties(prefix = "mykey.user") /*批量导入配置文件*/
public class User {


  private String username;


  private String password;


  private List<String> gfs;
}
