package com.learning.callBack_function;

public class MyOtherClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Create a callback object
        Callback callback = new Callback() {
            @Override
            public void onCallback() {
                System.out.print("inside callback from main");
            }
        };

        // Call the doSomething() method and pass in the callback object
        myClass.doSomething(callback);
    }
}