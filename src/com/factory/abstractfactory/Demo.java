package com.factory.abstractfactory;

import com.factory.abstractfactory.factories.GuiFactory;
import com.factory.abstractfactory.factories.MacOsFactory;
import com.factory.abstractfactory.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.draw();
    }

}
