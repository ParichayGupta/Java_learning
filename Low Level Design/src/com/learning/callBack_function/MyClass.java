package com.learning.callBack_function;

class MyClass {
    public void doSomething(Callback callback) {
        // Do something
        System.out.println("Inside do Something");
        callback.onCallback();
    }
}