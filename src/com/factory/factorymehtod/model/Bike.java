package com.factory.factorymehtod.model;

public class Bike implements Vehicle {

    private String name;

    @Override
    public void printName(String name) {
        this.name = name;
        System.out.println("Car name: " + name);
    }

}
