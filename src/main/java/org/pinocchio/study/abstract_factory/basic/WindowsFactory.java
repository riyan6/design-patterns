package org.pinocchio.study.abstract_factory.basic;

import org.pinocchio.study.abstract_factory.buttons.Button;
import org.pinocchio.study.abstract_factory.buttons.MacOSButton;
import org.pinocchio.study.abstract_factory.buttons.WindowsButton;
import org.pinocchio.study.abstract_factory.checkboxes.Checkbox;
import org.pinocchio.study.abstract_factory.checkboxes.MacOSCheckbox;
import org.pinocchio.study.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Windows工厂
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
