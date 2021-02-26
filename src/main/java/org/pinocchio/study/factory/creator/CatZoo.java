package org.pinocchio.study.factory.creator;

import org.pinocchio.study.factory.basic.Animal;
import org.pinocchio.study.factory.basic.Cat;

/**
 * 具体创建者；猫猫创建者
 */
public class CatZoo extends Zoo {
    @Override
    public Animal creatorAnimal() {
        return new Cat();
    }
}
