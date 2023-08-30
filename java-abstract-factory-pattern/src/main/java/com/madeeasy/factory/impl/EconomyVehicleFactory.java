package com.madeeasy.factory.impl;

import com.madeeasy.Bike;
import com.madeeasy.Car;
import com.madeeasy.factory.VehicleFactory;
import com.madeeasy.impl.MountainBike;
import com.madeeasy.impl.SedanCar;

public class EconomyVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new SedanCar();
    }

    @Override
    public Bike createBike() {
        return new MountainBike();
    }
}
