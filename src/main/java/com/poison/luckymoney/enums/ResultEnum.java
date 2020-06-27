package com.poison.luckymoney.enums;

/**
 * 结果状态枚举类
 *
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/27 18:11
 */

public enum ResultEnum {
    /** 成功 */
    REQUEST_SUCCESS(200,"成功"),

    /** 失败  */
    REQUEST_FAILED(-1,"失败"),

    /** 未知错误   */
    UNKNOWN_ERROR(500,"未知错误");


    /** 状态  */
    private Integer code;
    /** 含义 */
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
