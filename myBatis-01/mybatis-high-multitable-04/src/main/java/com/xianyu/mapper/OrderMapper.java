package com.xianyu.mapper;

import com.xianyu.pojo.Order;

public interface OrderMapper {
  Order selectOrderById(Integer orderId);
}
