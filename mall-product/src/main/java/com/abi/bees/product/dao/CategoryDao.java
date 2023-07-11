package com.abi.bees.product.dao;

import com.abi.bees.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 22:04:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
