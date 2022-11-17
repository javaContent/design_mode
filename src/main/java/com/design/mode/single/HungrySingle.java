package com.design.mode.single;

/**
 * 饿汉式
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:13 上午
 * @Email: yongye.ysf@raycloud.com
 */
public class HungrySingle {

    /* 私有构造方法，防止被实例化 */
    private HungrySingle() {
    }

    private static HungrySingle hungrySingle = new HungrySingle();

    public static HungrySingle getInstance() {
        return hungrySingle;
    }
}
