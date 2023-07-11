package com.abi.bees.coupon.dao;

import com.abi.bees.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:32:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
