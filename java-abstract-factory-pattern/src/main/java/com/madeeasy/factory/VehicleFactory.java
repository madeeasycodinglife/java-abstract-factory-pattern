package com.madeeasy.factory;

import com.madeeasy.Bike;
import com.madeeasy.Car;

public interface VehicleFactory{
    Car createCar();
    Bike createBike();
}
