/*
 * File: Operators.java
 *
 * Definition:
 * Operators are symbols used to perform operations on variables.
 *
 * Types of Operators:
 * 1. Arithmetic
 * 2. Relational
 * 3. Logical
 * 4. Assignment
 * 5. Unary
 *
 * Interview Questions:
 * Q1. Difference between == and equals()?
 * Q2. What is short-circuit operator?
 */

public class Operators {

    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println(a > b);   // true
        System.out.println(a == b);  // false

        // Logical Operators
        System.out.println(a > 0 && b > 0); // true
        System.out.println(a < 0 || b > 0); // true

        // Unary Operators
        a++;
        b--;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
