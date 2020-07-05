package com.factory.abstractfactory.buttons;

public class MacOsButton implements Button {

    @Override
    public void print() {
        System.out.println("macOS button was created.");
    }
}
