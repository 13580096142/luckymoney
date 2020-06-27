package com.poison.luckymoney.exception;

import com.poison.luckymoney.enums.ResultEnum;

/**
 * 自定义业务异常
 *
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/27 17:20
 */

public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = -1260775338752265332L;

    /** 异常状态码  */
    private Integer code;

    public BusinessException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
