package com.abi.bees.order.dao;

import com.abi.bees.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:48:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
