package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.buttons.Button;
import com.factory.abstractfactory.checkboxes.Checkbox;

public interface GuiFactory {

    Button createButton();
    Checkbox createCheckbox();
}
