package org.pinocchio.study.factory.creator;

import org.pinocchio.study.factory.basic.Animal;

/**
 * 基础创建者；动物园
 */
public abstract class Zoo {

    /**
     * 渲染动物园
     */
    public void renderAnimal() {
        // 业务逻辑...
        Animal animal = creatorAnimal();
        animal.render();
    }

    /**
     * 创建动物方法
     *
     * @return
     */
    public abstract Animal creatorAnimal();

}
