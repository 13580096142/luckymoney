package com.poison.luckymoney.controller;

import com.poison.luckymoney.entity.config.LimitConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * 测试controller
 *
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/25 11:41
 */

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/{money}")
    @ResponseBody
    public String hello(@PathVariable(value = "money")BigDecimal money) throws IllegalAccessException, InstantiationException {
        return LimitConfig.class.newInstance().getDescription()+"==="+money;
    }

    @PostMapping("/say")
    public String say(@RequestParam("words") String words){
        return "index";
    }
}
