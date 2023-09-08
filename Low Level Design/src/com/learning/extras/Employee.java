package com.learning.extras;

public class Employee {

    String name;
    int age;

    int empID;

    static {
        System.out.println("call from static block");
    }

    public Employee() {
        System.out.println("Employee Constructor called");
    }

    public String printEmpDetails(String name, int age, int empID){
        return "Hello my name is"+name+" I am "+age+ " years old My empid is "+empID;
    }


}
