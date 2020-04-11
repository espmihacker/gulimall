package com.atguigu.gulimall.prodocu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.prodocu.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author mihacker
 * @email mihacker@163.com
 * @date 2020-04-11 16:13:19
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

