package com.factory.abstractfactory;

import com.factory.abstractfactory.buttons.Button;
import com.factory.abstractfactory.checkboxes.Checkbox;
import com.factory.abstractfactory.factories.GuiFactory;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void draw() {
        button.print();
        checkbox.print();
    }
}
