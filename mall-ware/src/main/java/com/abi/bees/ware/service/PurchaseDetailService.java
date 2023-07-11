package com.abi.bees.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abi.bees.common.utils.PageUtils;
import com.abi.bees.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:52:04
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

