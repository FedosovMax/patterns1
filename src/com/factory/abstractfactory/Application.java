package com.factory.abstractfactory;

import com.factory.abstractfactory.doors.Doors;
import com.factory.abstractfactory.wheels.Wheels;
import com.factory.abstractfactory.factories.CarFactory;

public class Application {

    private final Doors doors;
    private final Wheels wheels;

    public Application(CarFactory factory) {
        doors = factory.createDoors();
        wheels = factory.createWheels();
    }

    public void draw() {
        doors.create();
        wheels.create();
    }
}
