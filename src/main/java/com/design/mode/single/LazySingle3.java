package com.design.mode.single;

/**
 * 懒汉式--代码块加锁+双重null判断
 * 因为指令重排序可能导致lazySingle先放在内存块，在new LazySingle3(); 极小概率会出现错误，所以+volatile关键字
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:15 上午
 * @Email: yongye.ysf@raycloud.com
 */
public class LazySingle3 {

    private volatile static LazySingle3 lazySingle;

    /* 私有构造方法，防止被实例化 */
    private LazySingle3() {
    }

    public static LazySingle3 getInstance() {
        if(lazySingle == null) {
            synchronized(LazySingle3.class) {
                if(lazySingle == null) {
                    lazySingle = new LazySingle3();
                }
            }
        }
        return lazySingle;
    }

}
