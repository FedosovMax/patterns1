package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.doors.FordDoors;
import com.factory.abstractfactory.doors.Doors;
import com.factory.abstractfactory.wheels.Wheels;
import com.factory.abstractfactory.wheels.FordWheels;

public class FordFactory implements CarFactory {

    @Override
    public Doors createDoors() {
        return new FordDoors();
    }

    @Override
    public Wheels createWheels() {
        return new FordWheels();
    }
}
