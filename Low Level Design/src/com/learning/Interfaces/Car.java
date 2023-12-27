package com.learning.Interfaces;

public interface Car {
    int seats = 4; // public static final

    int noOfWheels(); // Abstract Method -> Method without body | Mandatory to override in implementing class.

    default int noOfSeats(){
        return seats;
    }

    static String carName(){
        return "GTX";
    }
}
