package com.poison.luckymoney;

import com.poison.luckymoney.entity.base.Girl;
import com.poison.luckymoney.entity.base.Luckymoney;
import com.poison.luckymoney.repository.LuckymoneyRepository;
import com.poison.luckymoney.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LuckymoneyApplicationTests {

    private static final Logger log= LoggerFactory.getLogger(LuckymoneyApplicationTests.class);

    @Autowired
    private LuckymoneyRepository luckymoneyRepository;

    @Autowired
    private GirlService girlService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFindAll(){
        List<Luckymoney> all = luckymoneyRepository.findAll();
        all.forEach(System.out::println);
    }

    @Test
    @Transactional
    public void testFindOneLuckymoney() {
        Luckymoney one = luckymoneyRepository.getOne(7);
        System.out.println(one);
    }

    @Test
    public void testRepository(){
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setMoney(BigDecimal.valueOf(10));
        luckymoney.setConsumer("佛公开");
        luckymoney.setProducer("复活节");
        luckymoneyRepository.saveAndFlush(luckymoney);
    }



    @Test
    @Transactional
    public void testFindOne(){
        Girl girl = girlService.getGirl(8);
        Assert.assertEquals(new Integer(22),girl.getAge());
    }

}
