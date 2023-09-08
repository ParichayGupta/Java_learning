package com.learning.constructor;

import  java.util.List;

public class DefaultConstructor {

    String test;
    int test2;

    /*
    * Default Constructor
    It is created by JVM while at compile time.
    It gets created in class when there is no constructor present in class.
    It is also no args constructor.

    * */
    DefaultConstructor(String test) {
        this.test = test;
    }
}
