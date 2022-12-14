package com.design.mode.observers;

public interface Subject {

    // 添加订阅关系
    public void attach(Observer observer);
    // 移除订阅关系
    void detach(Observer observer);
    // 通知订阅者
    void notifyObservers(String message);
}
