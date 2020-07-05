package com.factory.factorymehtod.creator;

import com.factory.factorymehtod.model.Bike;
import com.factory.factorymehtod.model.Vehicle;

public class BykeProvider extends VehicleProvider {

    @Override
    protected Vehicle createVehicle(String name) {
        return new Bike();
    }
}
