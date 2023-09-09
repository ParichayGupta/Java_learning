package com.learning.abstractClass;

public class IceCar extends Car{

    String petrolOrDiesel(String petrolOrDiesel){

        return petrolOrDiesel;
    }

    @Override
    protected String engineType(String engine) {
        return null;
    }
}
