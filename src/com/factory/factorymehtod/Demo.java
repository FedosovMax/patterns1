package com.factory.factorymehtod;

import com.factory.factorymehtod.creator.BykeProvider;
import com.factory.factorymehtod.creator.CarProvider;
import com.factory.factorymehtod.creator.VehicleProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static VehicleProvider vehicleProvider;

    public static void main(String[] args) throws IOException {
        Demo demo = new Demo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        demo.configure(input);
        vehicleProvider.renderProduct("Fast vehicle");
    }

    private void configure (String input) {
        if(input.equals("car")) {
            vehicleProvider = new CarProvider();
        } else if(input.equals("byke")) {
            vehicleProvider = new BykeProvider();
        }
    }
}
