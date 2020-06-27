package com.poison.luckymoney.entity.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 * @Tools Created by IntelliJ IDEA.
 * @Author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/26 20:31
 */
@Entity
@Table(name = "girl")
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    /** 姓名  */
    private String firstName;

    /** 年龄  */
    @Min(value = 18,message = "未成年少女")
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
