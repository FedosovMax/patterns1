package com.factory.abstractfactory.doors;

public class HondaDoors implements Doors {

    @Override
    public void create() {
        System.out.println("Honda doors were created.");
    }
}
