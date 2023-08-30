package com.madeeasy;

import com.madeeasy.factory.VehicleFactory;
import com.madeeasy.factory.impl.EconomyVehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new EconomyVehicleFactory();

        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.drive(); // Output: Driving a Sedan Car
        bike.ride(); // Output: Riding a Mountain Bike
    }
}