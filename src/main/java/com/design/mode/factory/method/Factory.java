package com.design.mode.factory.method;

import com.design.mode.factory.entity.Animal;

/**
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 2:50 下午
 * @Email: yongye.ysf@raycloud.com
 */
public abstract class Factory {

    public abstract <T extends Animal> T createAnimal(Class<T> c);
}
