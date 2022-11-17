package com.design.mode.observers;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 5:20 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class ConcreteSubject implements Subject{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o: observerList) {
            o.update(message);
        }
    }
}
