/*
 * File: MethodOverloading.java
 *
 * Definition:
 * Method overloading allows multiple methods with
 * the SAME name but DIFFERENT parameters.
 *
 * Important Points:
 * - Happens at compile time
 * - Parameters must be different (number/type/order)
 *
 * Interview Questions:
 * Q1. Can we overload main() method? → YES
 * Q2. Can we overload by changing return type only? → NO
 */

public class MethodOverloading {

    // Method with two int parameters
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method with three int parameters
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method with double parameters
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Overloading main method (interview favorite)
    public static void main(String[] args) {

        System.out.println("Multiply 2 numbers: " + multiply(2, 3));
        System.out.println("Multiply 3 numbers: " + multiply(2, 3, 4));
        System.out.println("Multiply double values: " + multiply(2.5, 3.5));
    }
}
