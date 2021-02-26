package org.pinocchio.study.abstract_factory.basic;

import org.pinocchio.study.abstract_factory.buttons.Button;
import org.pinocchio.study.abstract_factory.checkboxes.Checkbox;

/**
 * 基本工厂
 */
public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

}
