package com.design.mode.factory.entity;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:33 上午
 * @Email: yongye.ysf@raycloud.com
 */
public class Bird extends Animal {

    /**
     * 翅膀
     */
    private String wing ="翅膀";

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    @Override
    public String call() {
        return "鸟叫";
    }
}
