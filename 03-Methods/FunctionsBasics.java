/*
 * File: FunctionsBasics.java
 *
 * Definition:
 * A method (function) is a block of code that performs
 * a specific task and can be reused.
 *
 * Why methods are important in DSA:
 * - Break large problems into smaller parts
 * - Improves readability and reusability
 * - Interviewers EXPECT modular code
 *
 * Method Syntax:
 * access_modifier return_type method_name(parameters)
 *
 * Interview Questions:
 * Q1. Difference between method and function in Java?
 * → Java has methods (functions inside a class).
 *
 * Q2. What is return type?
 * → It specifies what value a method returns.
 */

public class FunctionsBasics {

    // Method with no return type (void)
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // Method with parameters and return type
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {

        // Calling a method
        greet();

        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        int number = 7;
        System.out.println(number + " is even? " + isEven(number));
    }
}
