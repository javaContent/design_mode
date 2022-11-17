package com.design.mode.observers;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 5:22 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class FriendOneObserver implements Observer{

    @Override
    public void update(String message) {
        // 模拟处理业务逻辑
        System.out.println("FriendOne 知道了你发动态了" + message);
    }
}
