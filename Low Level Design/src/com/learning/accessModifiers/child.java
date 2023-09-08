package com.learning.accessModifiers;

public class child extends Parent{

    @Override
    protected void print() {
        super.print();
    }

    @Override
    public void printDetails() {
        super.printDetails();
    }

    @Override
    void printDefault() {
        super.printDefault();
    }
}
