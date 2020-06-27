package com.poison.luckymoney.controller;

import com.poison.luckymoney.entity.base.Girl;
import com.poison.luckymoney.service.GirlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Girl控制器
 *
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/26 20:30
 */
@RestController
public class GirlController {

    private static final Logger logger= LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlService girlService;

    /**
     * 查询所有
     *
     * @return 女孩列表
     */
    @GetMapping("/findAll")
    public List<Girl> findAll(){
        return girlService.findAll();
    }

    /**
     * 添加一个女孩
     *
     * @param girl 参数
     * @return 返回一个女孩
     */
    @PostMapping("/add")
    public String addGirl(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            logger.info(bindingResult.getFieldError().getDefaultMessage());
            return bindingResult.getFieldError().getDefaultMessage();
        }
        girlService.save(girl);
        return "添加成功";
    }
}
