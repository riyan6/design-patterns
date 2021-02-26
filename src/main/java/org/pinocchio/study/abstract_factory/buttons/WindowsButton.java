package org.pinocchio.study.abstract_factory.buttons;

/**
 * 抽象工厂模式 macos按钮产品
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows的按钮。");
    }
}
