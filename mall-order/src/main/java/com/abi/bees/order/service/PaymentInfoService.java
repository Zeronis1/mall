package com.abi.bees.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:48:52
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

