package org.pinocchio.study.abstract_factory;

import org.pinocchio.study.abstract_factory.basic.GUIFactory;
import org.pinocchio.study.abstract_factory.basic.MacOSFactory;
import org.pinocchio.study.abstract_factory.basic.WindowsFactory;

public class Demo {

    public static void main(String[] args) {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            factory = new WindowsFactory();
            application = new Application(factory);
        } else {
            factory = new MacOSFactory();
            application = new Application(factory);
        }
        application.paint();
    }

}
