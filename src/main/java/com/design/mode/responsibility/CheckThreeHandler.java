package com.design.mode.responsibility;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 4:31 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class CheckThreeHandler extends Handler{
    @Override
    public void doHandler() {
        System.out.println("CheckThreeHandler处理");
        doNext();
    }
}
