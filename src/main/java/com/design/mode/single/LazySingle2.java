package com.design.mode.single;

/**
 * 懒汉式--方法加锁，性能下降
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:15 上午
 * @Email: yongye.ysf@raycloud.com
 */
public class LazySingle2 {

    private static LazySingle2 lazySingle;

    /* 私有构造方法，防止被实例化 */
    private LazySingle2() {
    }

    public static synchronized LazySingle2 getInstance() {
        if(lazySingle == null) {
            lazySingle = new LazySingle2();
        }
        return lazySingle;
    }

}
