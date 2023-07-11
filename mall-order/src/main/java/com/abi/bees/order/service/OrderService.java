package com.abi.bees.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:48:52
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

