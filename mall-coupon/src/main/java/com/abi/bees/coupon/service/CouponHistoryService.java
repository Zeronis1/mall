package com.abi.bees.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:32:45
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

