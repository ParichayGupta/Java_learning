package com.learning.abstractClass;

public class Main {

    public static void main(String[] args) {

        /*
         * ABSTRACT CLASS
         * we make a class abstract when we do not want to create its object
         * - An abstract class should only have methods and no variables(Best Practice).
         *
         *
         * Why do we make a class abstract ?
         * - we have abstract methods in abstract class
         * - bcz abstract method is a method without body.
         *
         * so every class which extends the Abstract class need to override that method forcefully
         * and provide an implementation for it.
         *
         * This functionality from abstract class helps us achieve
         * - we have to forcefully override all its abstract methods so that if we create a new subclass
         * we do not miss any functionality.
         * */

        ElectricCar electricCar = new ElectricCar();
        electricCar.engineType("Electric Engine");
        electricCar.noOfSeats(6);
        electricCar.noOfWheels(4);
        electricCar.noOfWindows(4);

        IceCar iceCar = new IceCar();
        iceCar.engineType("Electric Engine");
        iceCar.noOfSeats(6);
        iceCar.noOfWheels(4);
        iceCar.noOfWindows(4);

        /*
        *   ABSTRACT CLASS
        *
        * - We cannot make an abstract method Private.
        * - We cannot make an abstract method in a non-abstract class.
        *
        * */

    }
}
