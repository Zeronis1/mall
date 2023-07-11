package com.abi.bees.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 22:04:56
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

