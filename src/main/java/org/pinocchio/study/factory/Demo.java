package org.pinocchio.study.factory;

import org.pinocchio.study.factory.creator.CatZoo;
import org.pinocchio.study.factory.creator.DogZoo;
import org.pinocchio.study.factory.creator.Zoo;

/**
 * 【工厂模式】测试类
 */
public class Demo {

    public static void main(String[] args) {
        Zoo catZoo = new CatZoo();
        catZoo.renderAnimal();
        System.out.println(" --- --- --- ");
        Zoo dogZoo = new DogZoo();
        dogZoo.renderAnimal();
    }

}
