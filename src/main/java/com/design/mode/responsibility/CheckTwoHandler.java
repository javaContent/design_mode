package com.design.mode.responsibility;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 4:31 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class CheckTwoHandler extends Handler{
    @Override
    public void doHandler() {
        System.out.println("CheckTwoHandler处理");
        doNext();
    }
}
