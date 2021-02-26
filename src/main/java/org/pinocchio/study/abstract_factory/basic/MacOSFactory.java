package org.pinocchio.study.abstract_factory.basic;

import org.pinocchio.study.abstract_factory.buttons.Button;
import org.pinocchio.study.abstract_factory.buttons.MacOSButton;
import org.pinocchio.study.abstract_factory.checkboxes.Checkbox;
import org.pinocchio.study.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Mac OS工厂
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
