package com.abi.bees.product.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.common.utils.Query;

import com.abi.bees.product.dao.CategoryDao;
import com.abi.bees.product.entity.CategoryEntity;
import com.abi.bees.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查询所有分类及其子分类
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {

        List<CategoryEntity> entities = new ArrayList<>(baseMapper.selectList(Wrappers.<CategoryEntity>lambdaQuery().orderByAsc(CategoryEntity::getCatId)));
        Map<Long, List<CategoryEntity>> longListNavigableMap = entities.stream().collect(Collectors.groupingBy(CategoryEntity::getParentCid));

        List<CategoryEntity> res = entities.stream()
                .peek(entity -> {
                    if (longListNavigableMap.containsKey(entity.getCatId())) {
                        entity.setChildren(longListNavigableMap.get(entity.getCatId()));
                    }
                })
                .filter(entity -> entity.getCatLevel() == 1)
                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());

        return res;
    }

}