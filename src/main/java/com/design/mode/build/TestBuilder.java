package com.design.mode.build;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 3:30 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class TestBuilder {

    public static void main(String[] args) {
        ItemBuilder itemBuilder = new ItemBuilder();
        Item item = itemBuilder
                        .codeBuilder()
                        .urlBuilder()
                        .builder();
        System.out.println("itemCode:" + item.getCode() + " itemUrl:" + item.getUrl());
    }
}
