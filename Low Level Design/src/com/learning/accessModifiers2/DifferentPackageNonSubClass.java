package com.learning.accessModifiers2;

import com.learning.accessModifiers.Parent;

public class DifferentPackageNonSubClass {

    Parent parent = new Parent();

    void callParentClassMethods(){
        parent.printDetails();
    }

}
