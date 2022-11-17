package com.design.mode.responsibility;

/**
 * 责任链模式处理
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 4:32 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class TestHandler {

    public static void main(String[] args) {
        Handler handler = new CheckOneHandler();
        Handler twoHandler = new CheckTwoHandler();
        Handler threeHandler = new CheckThreeHandler();

        handler.next(twoHandler);
        twoHandler.next(threeHandler);

        handler.doHandler();
    }
}
