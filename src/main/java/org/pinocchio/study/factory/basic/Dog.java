package org.pinocchio.study.factory.basic;

/**
 * 产品；动物：狗
 */
public class Dog implements Animal {

    @Override
    public void render() {
        System.out.println("狗出现了。");
    }

    @Override
    public void eat() {
        System.out.println("狗在吃饭。");
    }

    @Override
    public void sleep() {
        System.out.println("狗在吃饭。");
    }

}
