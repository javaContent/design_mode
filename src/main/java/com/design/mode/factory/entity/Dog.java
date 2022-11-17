package com.design.mode.factory.entity;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:29 上午
 * @Email: yongye.ysf@raycloud.com
 */
public class Dog extends Animal{

    /**
     * 尾巴
     */
    private String tail = "尾巴";

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public String call() {
        return "狗叫";
    }
}
