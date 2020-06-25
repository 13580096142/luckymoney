package com.poison.luckymoney.entity.base;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 红包实体类
 *
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/25 16:12
 */

@Entity
public class Luckymoney {

    /** 红包id，主键自增  */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /** 红包金额  */
    private BigDecimal money;

    /** 发送者  */
    private String producer;

    /** 接收者  */
    private String consumer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    @Override
    public String toString() {
        return "Luckymoney{" +
                "id=" + id +
                ", money=" + money +
                ", producer='" + producer + '\'' +
                ", consumer='" + consumer + '\'' +
                '}';
    }
}
