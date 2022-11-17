package com.design.mode.single;

/**
 * 静态内部类实例对象
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:15 上午
 * @Email: yongye.ysf@raycloud.com
 */
public class LazySingle4 {

    private static LazySingle4 lazySingle;

    /* 私有构造方法，防止被实例化 */
    private LazySingle4() {
    }

    private static class LazySingleFactory {
        private static LazySingle4 lazySingle = new LazySingle4();
    }

    public static LazySingle4 getInstance() {
        return LazySingleFactory.lazySingle;
    }

}
