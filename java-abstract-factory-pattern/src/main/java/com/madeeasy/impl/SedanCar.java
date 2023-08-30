package com.madeeasy.impl;

import com.madeeasy.Car;

public class SedanCar implements Car {

    @Override
    public void drive() {
        System.out.println("Driving a Sedan car...");
    }
}
