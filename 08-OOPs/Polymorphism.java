/*
 * File: Polymorphism.java
 *
 * Definition:
 * Polymorphism means "many forms".
 *
 * Types:
 * 1. Compile-time (method overloading)
 * 2. Runtime (method overriding)
 *
 * Interview Questions:
 * Q1. Difference between overloading and overriding?
 * Q2. Can static methods be overridden? → NO
 */

class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {

    // Method overriding
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Shape s = new Circle(); // upcasting
        s.draw();               // runtime polymorphism
    }
}


// 🎯 OOPs Interview Rapid-Fire (VERY IMPORTANT)

// OOP pillars → Encapsulation, Inheritance, Polymorphism, Abstraction

// this keyword usage

// super keyword

// final, static, abstract differences