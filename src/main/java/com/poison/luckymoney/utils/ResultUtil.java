package com.poison.luckymoney.utils;

import com.poison.luckymoney.common.Result;
import com.poison.luckymoney.entity.base.Girl;

/**
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/27 16:43
 */

public class ResultUtil {

    /**
     * 处理请求成功,返回数据
     *
     * @param o 具体数据
     * @return 返回统一响应结果
     */
    public static Result<Object> success(Object o){
        Result<Object> girlResult = new Result<>();
        girlResult.setCode(1);
        girlResult.setMsg("成功");
        girlResult.setData(o);
        return girlResult;
    }

    /**
     * 处理请求成功，无数据返回
     *
     * @return 返回统一响应结果
     */
    public static Result<Object> success(){
        return success(null);
    }

    /**
     * 失败请求
     *
     * @return 返回统一响应结果
     */
    public static Result<Object> error(Integer code,String msg){
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(code);
        objectResult.setMsg(msg);
        objectResult.setData(null);
        return objectResult;
    }

}
