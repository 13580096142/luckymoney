package com.poison.luckymoney.handle;

import com.poison.luckymoney.common.Result;
import com.poison.luckymoney.exception.BusinessException;
import com.poison.luckymoney.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常处理类
 *
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/27 17:25
 */
@RestController
public class GlobalExceptionHandler {

    /** 打印日志  */
    private static final Logger log= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 统一异常处理
     *
     * @param e 异常对象
     * @return 统一响应结果
     */
    @ExceptionHandler(value = Exception.class)
    public Result<Object> handleException(Exception e){
        if (e instanceof BusinessException){
            BusinessException businessException=(BusinessException) e;
            return ResultUtil.error(businessException.getCode(),e.getMessage());
        }
        log.error(" 系统异常 {} ",e);
        return ResultUtil.error(-1,"未知错误，请联系系统管理员！");
    }
}
