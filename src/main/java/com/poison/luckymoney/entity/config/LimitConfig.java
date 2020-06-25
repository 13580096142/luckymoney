package com.poison.luckymoney.entity.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 限制金额类
 *
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/25 15:11
 */
@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {

    /**  最小金额  */
    private BigDecimal minMoney;

    /**  最大金额   */
    private BigDecimal maxMoney;

    /**  红包说明 */
    private String description;

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "LimitConfig{" +
                "minMoney=" + minMoney +
                ", maxMoney=" + maxMoney +
                ", description='" + description + '\'' +
                '}';
    }
}
