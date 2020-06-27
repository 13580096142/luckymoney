package com.poison.luckymoney.service;

import com.poison.luckymoney.entity.base.Girl;

import java.util.List;

/**
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/26 20:34
 */

public interface GirlService {
    /**
     * 查询所有
     *
     * @return Girl列表
     */
    List<Girl> findAll();

    /**
     * 添加一个女生
     *
     * @param girl 女孩信息
     * @return 返回添加结果
     */
    int save(Girl girl);

    /**
     * 查询一个女孩
     * @param id 女孩id
     * @return 女孩
     */
    Girl getGirl(Integer id);
}
