package com.learning.abstractClass;

public class ElectricCar extends Car{

    String typeOfBattery(String typeOfBattery){
        return typeOfBattery;
    }

    @Override
    protected String engineType(String engine) {
        return null;
    }
}
