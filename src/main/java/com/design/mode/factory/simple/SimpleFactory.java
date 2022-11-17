package com.design.mode.factory.simple;

import com.design.mode.factory.entity.Animal;
import com.design.mode.factory.entity.Bird;
import com.design.mode.factory.entity.Dog;

/**
 * 简单工厂
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 11:27 上午
 * @Email: yongye.ysf@raycloud.com
 */
public class SimpleFactory {

    public Animal getAnimal(String type) {
        if(type.equals("dog")) {
            return new Dog();
        } else if(type.equals("bird")) {
            return new Bird();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Animal dog = factory.getAnimal("dog");
        System.out.println(((Dog)dog).getTail());
    }
}
