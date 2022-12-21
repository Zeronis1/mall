package com.abi.bees.product.vo.resp;

import com.abi.bees.product.vo.AttrVo;
import lombok.Data;


/**
 * @author SLF
 * @date 2022/12/21
 */
@Data
public class AttrResp extends AttrVo {

    /**
     * 分类名称
     */
    private String catelogName;

    /**
     * 分组名称
     */
    private String groupName;
}
