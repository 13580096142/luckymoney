package com.poison.luckymoney.common;

import java.io.Serializable;

/**
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/27 15:59
 */

public class Result<T> implements Serializable {

    private static final long serialVersionUID = -7557258753883492883L;

    /** 状态码  */
    private Integer code;

    /** 提示信息  */
    private String msg;

    /** 返回数据  */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
