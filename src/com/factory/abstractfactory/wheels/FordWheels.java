package com.factory.abstractfactory.wheels;

public class FordWheels implements Wheels {
    @Override
    public void create() {
        System.out.println("Ford wheels were created");
    }
}
