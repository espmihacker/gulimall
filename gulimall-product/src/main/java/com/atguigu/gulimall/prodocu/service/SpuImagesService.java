package com.atguigu.gulimall.prodocu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.prodocu.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author mihacker
 * @email mihacker@163.com
 * @date 2020-04-11 16:13:19
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

