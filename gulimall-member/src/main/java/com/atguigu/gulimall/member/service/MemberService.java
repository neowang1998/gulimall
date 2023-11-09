package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author neo
 * @email sunlightcs@gmail.com
 * @date 2023-11-09 23:16:07
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

