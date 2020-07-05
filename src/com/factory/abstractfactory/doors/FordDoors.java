package com.factory.abstractfactory.doors;

public class FordDoors implements Doors {

    @Override
    public void create() {
        System.out.println("Ford doors were created.");
    }
}
