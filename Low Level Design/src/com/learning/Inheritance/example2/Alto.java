package com.learning.Inheritance.example2;

public class Alto extends Car{
    private int noOfwheels;
    private int noOfSeats;

    /*
    * this constructor is calling the constructor of Super class (Car class)
    * and initialising the variables of super class.
    * */
    public Alto(int noOfWheels, int noOfSeats) {
        super(noOfWheels, noOfSeats);
    }

    public String gearType(){
        return "I have manual gear";
    }
    /*
    *
    * This method will initialise local variables
    * -this.noOfWheels
    * -this.noOfSeats
    * */

    public int newAlto(int noOfSeats, int noOfWheels){
        this.noOfSeats = noOfSeats;
        this.noOfwheels = noOfWheels;
        return this.noOfwheels;
    }

}
