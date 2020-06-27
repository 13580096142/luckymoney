package com.poison.luckymoney.repository;

import com.poison.luckymoney.entity.base.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 红包~持久层
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/26 10:42
 */
@Repository
public interface LuckymoneyRepository extends JpaRepository<Luckymoney,Integer> {
}
