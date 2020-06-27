package com.poison.luckymoney.service.impl;

import com.poison.luckymoney.common.Result;
import com.poison.luckymoney.entity.base.Girl;
import com.poison.luckymoney.enums.ResultEnum;
import com.poison.luckymoney.exception.BusinessException;
import com.poison.luckymoney.repository.GirlRepository;
import com.poison.luckymoney.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/26 20:34
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED,readOnly = false)
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlRepository girlRepository;


    @Override
    public List<Girl> findAll() {
        return girlRepository.findAll();
    }

    @Override
    public int save(Girl girl) {
        Girl g = girlRepository.save(girl);
        Optional<Girl> girlOptional = Optional.of(girl);
        if(girlOptional.isPresent()){
            throw new BusinessException(ResultEnum.REQUEST_FAILED);
        }
        return 1;
    }

    @Override
    public Girl getGirl(Integer id) {
        return girlRepository.getOne(id);
    }
}
