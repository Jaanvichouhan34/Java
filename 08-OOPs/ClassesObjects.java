/*
 * File: ClassesObjects.java
 *
 * Definition:
 * A class is a blueprint of an object.
 * An object is an instance of a class.
 *
 * Why important:
 * - Foundation of OOP
 * - Used in every real-world Java application
 *
 * Interview Questions:
 * Q1. What is an object?
 * Q2. Can a class exist without an object? → YES
 */

class Student {

    String name;
    int age;

    // Method inside class
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassesObjects {

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();
        s1.name = "Jaanvi";
        s1.age = 21;

        s1.display();
    }
}
