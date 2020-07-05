package com.factory.abstractfactory.wheels;

public class HondaWheels implements Wheels {
    @Override
    public void create() {
        System.out.println("Honda wheels were created");
    }
}
