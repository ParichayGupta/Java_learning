package com.learning.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Stream.of(
                new Student(1, "Parichay", 26, "male", "Computer Science", "Indore", 1, Arrays.asList("9988776655", "11223334455")),
                new Student(2, "Somya", 24, "female", "Computer Science", "Indore", 2, Arrays.asList("1100101010", "9090909090")),
                new Student(3, "Muskan", 54, "female", "Information Technology", "Kanpur", 509, Arrays.asList("00000000000", "11111111111")),
                new Student(4, "Ankita", 22, "female", "Information Technology", "Bangalore", 22, Arrays.asList("3333333333", "22222222222")),
                new Student(5, "Himanshu", 56, "male", "Information Technology", "Jaipur", 101, Arrays.asList("4444444444", "555555555555")),
                new Student(6, "Vedant", 72, "male", "Mass Com", "Jamnagar", 90, Arrays.asList("777777777777", "6666666666")),
                new Student(7, "Yash", 39, "male", "Fire Tech", "Jaipur", 25, Arrays.asList("88888888888", "9999999999")),
                new Student(8, "Twinkle", 46, "female", "Fire Tech", "Kanpur", 220, Arrays.asList("101010101010", "0000000000")),
                new Student(9, "Neha", 49, "female", "Information Technology", "Jaipur", 110, Arrays.asList("1234567890", "0987654321")),
                new Student(10, "Nikita", 20, "female", "Electrical Engineering", "Bhopal", 223, Arrays.asList("1234509876", "56789012345")),
                new Student(11, "Yug", 36, "male", "Chemical Engineering", "Bangalore", 98, Arrays.asList("1029384756", "5647382910"))
        ).toList();

//      Print list of all the students
        System.out.println(students);

//      Find the list of students whose rank is in between 50 and 100
        List<Student> students1 = students.stream()
                .filter(student -> student.getRank() > 50 && student.getRank() < 100)
                .toList();
        System.out.println(students1);

//      Find the Students who stays in Jaipur and sort them by their names
        List<Student> students2 = students.stream()
                .filter(student -> student.getCity().equalsIgnoreCase("Jaipur"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .toList();
        System.out.println(students2);

//      Find all departments names

        List<String> departments = students.stream()
                .map(Student::getDept)
                .distinct()
                .toList();
        System.out.println(departments);

        Set<String> departmentsSet = students.stream()
                .map(Student::getDept)
                .collect(Collectors.toSet());
        System.out.println(departmentsSet);

//      Find all the contact numbers
        //one2one-> map
        //one2many-> flatmap
        List<List<String>> contacts = students.stream()
                .map(Student::getContacts)
                .toList();
        System.out.println(contacts);

        List<String> contacts2 = students.stream()
                .flatMap(student -> student.getContacts().stream())
                .toList();
        System.out.println(contacts2);

//      Group The Student By Department Names
        Map<String, List<Student>> departmentNames = students.stream().collect(Collectors.groupingBy(Student::getDept));
        System.out.println(departmentNames);

    }
}
