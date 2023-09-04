package com.learning.constructor;

public class Main {
    public static void main(String[] args) {

        /*
        * Constructor in java

           - Special type of method
           - Same name as class name and no return type
           - We can create as many constructors in a class as we want.

        Types of Constructor
            - Default Constructor
            - No-Args constructor/ no-params
            - Parameterised Constructor
            - Copy Constructor

        * */
//        Calling no arags cosntructor or default constructor
        DefaultConstructor defaultConstructor = new DefaultConstructor();
//        Calling parameterised constructor
        ParameterisedConstructor parameterisedConstructor = new ParameterisedConstructor(10, "");

//        Calling Copy Constructor

        Phone iPhone14 = new Phone(6,"Apple", 14, 3000, 70000,4);
        Phone iPhone15 = new Phone(iPhone14);

    }
}