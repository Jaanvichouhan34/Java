/*
 * File: Loops.java
 *
 * Definition:
 * Loops are used to execute a block of code repeatedly
 * until a condition becomes false.
 *
 * Types of Loops:
 * 1. for loop
 * 2. while loop
 * 3. do-while loop
 *
 * Interview Questions:
 * Q1. Difference between while and do-while?
 * Q2. Which loop is best for known iterations? → for loop
 */

public class Loops {

    public static void main(String[] args) {

        // for loop (when iterations are known)
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }

        // while loop (condition-based)
        int i = 1;
        while (i <= 5) {
            System.out.println("While Loop: " + i);
            i++;
        }

        // do-while loop (executes at least once)
        int j = 1;
        do {
            System.out.println("Do-While Loop: " + j);
            j++;
        } while (j <= 5);
    }
}
