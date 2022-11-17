package com.design.mode.responsibility;

/**
 * 处理父类
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 4:29 下午
 * @Email: yongye.ysf@raycloud.com
 */
public abstract class Handler {

    protected Handler handler;

    public void next(Handler handle) {
        this.handler = handle;
    }

    public void doNext() {
        if(handler != null) {
            handler.doHandler();
        }
    }

    public abstract void doHandler();

}
