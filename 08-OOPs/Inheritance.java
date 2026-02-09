/*
 * File: Inheritance.java
 *
 * Definition:
 * Inheritance allows one class to acquire
 * properties and methods of another class.
 *
 * Why important:
 * - Code reusability
 * - Hierarchical structure
 *
 * Interview Questions:
 * Q1. Types of inheritance in Java?
 * Q2. Why Java does not support multiple inheritance with classes?
 */

class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();   // inherited method
        dog.bark();
    }
}
