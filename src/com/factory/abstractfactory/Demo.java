package com.factory.abstractfactory;

import com.factory.abstractfactory.factories.CarFactory;
import com.factory.abstractfactory.factories.HondaFactory;
import com.factory.abstractfactory.factories.FordFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static Application configureApplication() throws IOException {
        Application app;
        CarFactory factory;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();

        if (input.contains("honda")) {
            factory = new HondaFactory();
        } else {
            factory = new FordFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) throws IOException {
        Application app = configureApplication();
        app.draw();
    }
}
