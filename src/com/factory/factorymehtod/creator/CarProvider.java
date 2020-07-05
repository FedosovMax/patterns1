package com.factory.factorymehtod.creator;

import com.factory.factorymehtod.model.Car;
import com.factory.factorymehtod.model.Vehicle;

public class CarProvider extends VehicleProvider {

    @Override
    protected Vehicle createVehicle(String name) {
        return new Car();
    }
}
