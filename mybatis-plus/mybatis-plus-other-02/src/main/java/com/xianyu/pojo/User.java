package com.xianyu.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@TableName("user") // 手动指定查询的表名，不加时默认使用类名作为表名查询，忽略大小写
@Data
public class User {
  @TableField("name") // 当非主键字段名与属性名不同时，用以指定属性在表中的字段名 ， 其中exist属性为false时表示该属性与数据库字段不存在映射关系
  private String name;
  @TableId(value = "id", type = IdType.AUTO) // 当字段名与属性名不同时，用以指定主键名称,TYPE指定主键策略（AUTO 自增，ASSGN_ID 由mybatis自动生成主键）
  private Integer id;
  private Integer age;
  private String email;
  @TableLogic /*指定为逻辑删除字段*/
  private Integer deleted;
  @Version /*指定该字段为数据版本字段*/
  private Integer version;
}
