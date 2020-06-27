package com.poison.luckymoney.controller;

import com.poison.luckymoney.entity.base.Luckymoney;
import com.poison.luckymoney.repository.LuckymoneyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/26 10:46
 */
@RestController
public class LuckymoneyController {

    private final LuckymoneyRepository luckymoneyRepository;

    public LuckymoneyController(LuckymoneyRepository luckymoneyRepository) {
        this.luckymoneyRepository = luckymoneyRepository;
    }

    @GetMapping("/lucky")
    public List<Luckymoney> listLuckymoney(){
        return luckymoneyRepository.findAll();
    }
}
