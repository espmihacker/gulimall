package com.atguigu.gulimall.prodocu.dao;

import com.atguigu.gulimall.prodocu.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mihacker
 * @email mihacker@163.com
 * @date 2020-04-11 16:13:19
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
