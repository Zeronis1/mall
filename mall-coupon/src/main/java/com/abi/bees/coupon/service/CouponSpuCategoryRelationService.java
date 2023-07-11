package com.abi.bees.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:32:45
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

