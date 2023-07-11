package com.abi.bees.ware.dao;

import com.abi.bees.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:52:04
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
