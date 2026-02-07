/*
 * File: Abstraction.java
 *
 * Definition:
 * Abstraction hides implementation details
 * and shows only essential features.
 *
 * Achieved using:
 * - Abstract classes
 * - Interfaces
 *
 * Interview Questions:
 * Q1. Can abstract class have constructor? → YES
 * Q2. Can abstract method be private? → NO
 */

abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Concrete method
    void fuelType() {
        System.out.println("Uses fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
        v.fuelType();
    }
}
