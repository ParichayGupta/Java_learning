package com.learning.accessModifiers;

public class Parent {

    public void printDetails(){
        System.out.println("public method called");
    }

    protected void print(){
        System.out.println("Protected method called");
    }

    void printDefault(){
        System.out.println("DEfault method called");
    }

    private void printPrivate(){
        System.out.println("Private method called");
    }

}
