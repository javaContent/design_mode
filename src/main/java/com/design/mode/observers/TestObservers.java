package com.design.mode.observers;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 5:23 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class TestObservers {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        FriendOneObserver oneObserver = new FriendOneObserver();
        FriendTwoObserver twoObserver = new FriendTwoObserver();
        //添加通知关系
        subject.attach(oneObserver);
        subject.attach(twoObserver);
        subject.notifyObservers("发布第一条朋友圈");

        //删除关系
        subject.detach(twoObserver);
        subject.notifyObservers("发布第二条朋友圈");
    }
}
