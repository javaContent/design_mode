package com.design.mode.factory.method;

import com.design.mode.factory.entity.Animal;
import com.design.mode.factory.entity.Bird;
import com.design.mode.factory.entity.Dog;

/**
 * 通过反射生成对象
 * @Author:永夜-杨帅菲
 * @Date: 2022/11/17 2:51 下午
 * @Email: yongye.ysf@raycloud.com
 */
public class CreateFactory extends Factory{

    @Override
    public <T extends Animal> T createAnimal(Class<T> c) {
        Animal animal = null;
        try {
            animal = (Animal) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("创建失败");
        }
        return (T) animal;
    }
}
