package com.learning.polymorphism.methodOverriding;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.printStudentName("Somya");
        Student2 student2 = new Student2();
        s.printStudentName("Krishna");
    }
}
