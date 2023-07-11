package com.abi.bees.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 22:04:56
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

