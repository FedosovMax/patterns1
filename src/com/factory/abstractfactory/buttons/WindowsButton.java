package com.factory.abstractfactory.buttons;

public class WindowsButton implements Button {

    @Override
    public void print() {
        System.out.println("windows button was created.");
    }
}
