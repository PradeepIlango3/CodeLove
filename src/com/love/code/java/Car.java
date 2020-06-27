package com.love.code.java;

public abstract class Car {

    // Class Data members
    int totalSpeed;
    int fuelCapacity;
    int totalSeats;
    String manufacturer;

    // Class Methods
    abstract void refuel();
    abstract void park();
    abstract void drive();

}
