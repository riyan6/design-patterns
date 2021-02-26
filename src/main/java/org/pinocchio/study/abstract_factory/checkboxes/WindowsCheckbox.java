package org.pinocchio.study.abstract_factory.checkboxes;

/**
 * 抽象工厂模式 Windows多选按钮产品
 */
public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Windows的多选按钮。");
    }
}
