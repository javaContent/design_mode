package com.design.mode.single;

/**
 * 懒汉式--线程不安全，可能创建多个LazySingle1实例
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:15 上午
 * @Email: yongye.ysf@raycloud.com
 */
public class LazySingle1 {

    private static LazySingle1 lazySingle;

    /* 私有构造方法，防止被实例化 */
    private LazySingle1() {
    }

    public static LazySingle1 getInstance() {
        if(lazySingle == null) {
            lazySingle = new LazySingle1();
        }
        return lazySingle;
    }

}
