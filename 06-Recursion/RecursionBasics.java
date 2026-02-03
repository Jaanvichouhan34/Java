/*
 * File: RecursionBasics.java
 *
 * Definition:
 * Recursion is a process where a function calls itself
 * to solve a problem.
 *
 * Key Components of Recursion:
 * 1. Base Case  → stops recursion
 * 2. Recursive Call → function calling itself
 *
 * Why recursion is important in DSA:
 * - Used in tree, graph, DP problems
 * - Simplifies complex problems
 *
 * Interview Questions:
 * Q1. What happens if base case is missing?
 * → StackOverflowError
 * Q2. Difference between recursion and iteration?
 */

public class RecursionBasics {

    // Print numbers from 1 to n using recursion
    public static void printNumbers(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        printNumbers(n - 1);

        // Work after recursive call
        System.out.print(n + " ");
    }

    // Factorial using recursion
    public static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.print("Numbers from 1 to " + n + ": ");
        printNumbers(n);

        System.out.println();
        System.out.println("Factorial of " + n + ": " + factorial(n));
    }
}
