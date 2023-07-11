package com.abi.bees.member.dao;

import com.abi.bees.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author SLF
 * @email SLF@gmail.com
 * @date 2023-07-11 23:44:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
