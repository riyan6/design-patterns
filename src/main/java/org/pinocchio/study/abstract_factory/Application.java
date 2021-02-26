package org.pinocchio.study.abstract_factory;

import org.pinocchio.study.abstract_factory.basic.GUIFactory;
import org.pinocchio.study.abstract_factory.buttons.Button;
import org.pinocchio.study.abstract_factory.checkboxes.Checkbox;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }

}
