package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.doors.Doors;
import com.factory.abstractfactory.doors.HondaDoors;
import com.factory.abstractfactory.wheels.Wheels;
import com.factory.abstractfactory.wheels.HondaWheels;

public class HondaFactory implements CarFactory {

    @Override
    public Doors createDoors() {
        return new HondaDoors();
    }

    @Override
    public Wheels createWheels() {
        return new HondaWheels();
    }
}
