package com.learning.Inheritance.example2;

public class GWagon extends Car{

    public GWagon(int noOfWheels, int noOfSeats) {
        super(noOfWheels, noOfSeats);
    }

    public String heatedSeats(){
        return "I have heated seats";
    }
}
