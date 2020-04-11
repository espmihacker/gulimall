package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mihacker
 * @email mihacker@163.com
 * @date 2020-04-05 02:55:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
