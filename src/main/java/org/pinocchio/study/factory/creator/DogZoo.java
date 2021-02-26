package org.pinocchio.study.factory.creator;

import org.pinocchio.study.factory.basic.Animal;
import org.pinocchio.study.factory.basic.Dog;

/**
 * 具体创建者；狗创建者
 */
public class DogZoo extends Zoo {

    @Override
    public Animal creatorAnimal() {
        return new Dog();
    }
}
