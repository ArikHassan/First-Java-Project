package com.BasicApp;

//====================================================================================
// OOP in Java
// Object = entity that holds data (attributes)
//          - can perform actions   (methods)
//          - it is a reference data type
/*
A class is a blueprint for creating objects
this file contains a Car class that represents a Car
*/


public class Car {
    // attributes
    String make = "Toyota";
    String model = "Highlander";
    int year = 2025;
    double price = 48000.99;
    boolean isRunning = false;

    void startCar(){
        isRunning = true;
        System.out.println("Engine started");
    }

    void stopCar(){
        isRunning = true;
        System.out.println("Engine stopped");
    }

    void drive(){
        System.out.println(model + " is driving");
    }

    void brake(){
        System.out.println(model + " is braking");
    }
}
