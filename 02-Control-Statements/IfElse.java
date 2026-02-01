/*
 * File: IfElse.java
 *
 * Definition:
 * if-else is a decision-making statement used to execute
 * code based on a condition (true/false).
 *
 * Important Points:
 * - Condition must return boolean
 * - Used heavily in DSA logic
 *
 * Interview Questions:
 * Q1. Can we use else without if? → NO
 * Q2. Difference between if and if-else ladder?
 */

public class IfElse {

    public static void main(String[] args) {

        int number = 15;

        // Simple if-else
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // if-else-if ladder
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
