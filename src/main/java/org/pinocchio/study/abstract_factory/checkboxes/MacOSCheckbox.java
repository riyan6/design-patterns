package org.pinocchio.study.abstract_factory.checkboxes;

/**
 * 抽象工厂模式 MacOs多选按钮产品
 */
public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Mac OS的多选按钮。");
    }
}
