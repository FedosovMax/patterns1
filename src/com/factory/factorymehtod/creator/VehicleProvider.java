package com.factory.factorymehtod.creator;

import com.factory.factorymehtod.model.Vehicle;

public abstract class VehicleProvider {

    public void renderProduct(String name) {
        Vehicle p = createVehicle(name);
        p.printName(name);
    }

    protected abstract Vehicle createVehicle(String name);
}
