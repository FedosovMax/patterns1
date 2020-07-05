package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.buttons.Button;
import com.factory.abstractfactory.buttons.MacOsButton;
import com.factory.abstractfactory.checkboxes.Checkbox;
import com.factory.abstractfactory.checkboxes.MacOsCheckbox;

public class MacOsFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
