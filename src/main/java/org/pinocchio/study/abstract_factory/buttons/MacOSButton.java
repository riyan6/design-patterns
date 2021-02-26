package org.pinocchio.study.abstract_factory.buttons;

/**
 * 抽象工厂模式 MacOs按钮产品
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac OS的按钮。");
    }

}
