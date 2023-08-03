package com.abi.bees.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 22:04:56
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询所有分类及其子分类
     */
    List<CategoryEntity> listWithTree();

    /**
     * 批量删除菜单
     */
    void removeMenuByIds(List<Long> list);
}

