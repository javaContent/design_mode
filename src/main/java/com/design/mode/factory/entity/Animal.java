package com.design.mode.factory.entity;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:29 上午
 * @Email: yongye.ysf@raycloud.com
 */
public abstract class Animal {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract String call();

}
