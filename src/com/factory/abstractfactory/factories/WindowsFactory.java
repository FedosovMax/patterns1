package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.buttons.Button;
import com.factory.abstractfactory.buttons.WindowsButton;
import com.factory.abstractfactory.checkboxes.Checkbox;
import com.factory.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
