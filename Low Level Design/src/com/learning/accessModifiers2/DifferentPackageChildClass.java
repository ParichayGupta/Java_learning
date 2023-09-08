package com.learning.accessModifiers2;

import com.learning.accessModifiers.Parent;

public class DifferentPackageChildClass extends Parent {

    @Override
    public void printDetails() {
        super.printDetails();
    }

    @Override
    protected void print() {
        super.print();
    }

}
