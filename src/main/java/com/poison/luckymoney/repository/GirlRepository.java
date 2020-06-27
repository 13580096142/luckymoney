package com.poison.luckymoney.repository;

import com.poison.luckymoney.entity.base.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/26 20:37
 */
@Repository
public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
