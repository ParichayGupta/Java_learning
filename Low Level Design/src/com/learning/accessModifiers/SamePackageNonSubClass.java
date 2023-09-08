package com.learning.accessModifiers;

public class SamePackageNonSubClass {
    Parent parent = new Parent();
    public void callingParentClassMethod(){
        parent.printDefault();
        parent.printDetails();
        parent.print();
    }


}
