package com.abi.bees.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:52:04
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

