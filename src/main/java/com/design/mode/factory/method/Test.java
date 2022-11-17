package com.design.mode.factory.method;

import com.design.mode.factory.entity.Bird;
import com.design.mode.factory.entity.Dog;

/**
 * 通过创建类型class通过反射生成对象
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 3:00 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class Test {

    public static void main(String[] args) {
        CreateFactory factory = new CreateFactory();

        Dog dog = factory.createAnimal(Dog.class);
        System.out.println(dog.call());

        Bird bird = factory.createAnimal(Bird.class);
        System.out.println(bird.call());
    }
}
