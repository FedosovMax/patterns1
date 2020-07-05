package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.doors.Doors;
import com.factory.abstractfactory.wheels.Wheels;

public interface CarFactory {

    Doors createDoors();
    Wheels createWheels();
}
