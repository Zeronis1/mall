package com.abi.bees.order.dao;

import com.abi.bees.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:48:52
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
