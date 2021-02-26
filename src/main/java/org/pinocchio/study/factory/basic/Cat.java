package org.pinocchio.study.factory.basic;

/**
 * 产品；动物：猫
 */
public class Cat implements Animal {

    @Override
    public void render() {
        System.out.println("猫猫出现了。");
    }

    @Override
    public void eat() {
        System.out.println("猫猫在吃饭。");
    }

    @Override
    public void sleep() {
        eat();
        System.out.println("猫猫在睡觉。");
    }
}
