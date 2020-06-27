package com.poison.luckymoney.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 切面类：处理前端http请求
 *
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/27 13:03
 */
@Aspect
@Component
public class HttpAspect {

    private static final Logger log= LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.poison.luckymoney.controller.*.*(..))")
    private void pt(){}

    /**
     * 前置通知
     * @param joinPoint
     */
    @Before("pt()")
    public void doBefore(JoinPoint joinPoint){
        //获取Http请求信息
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        //url
        log.info("url={}",request.getRequestURL());
        //method
        log.info("method={}",request.getMethod());
        //IP
        log.info("ip={}",request.getRemoteAddr());
        //类方法
        log.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //请求参数
        log.info("args={}",joinPoint.getArgs());
        log.info("before......");
    }

    /**
     * 后置通知
     */
    @AfterReturning(value = "pt()",returning ="object" )
    public void doAfterReturning(Object object){
        log.info("response={}",object);
    }


    /**
     * 最终通知
     */
    @After("pt()")
    public void doAfter(){
        log.info("after......");
    }

}
