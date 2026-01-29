/*
 * File: InputOutput.java
 *
 * Definition:
 * Java provides Scanner class to take input from user.
 *
 * Important:
 * - Scanner is present in java.util package
 * - Must import Scanner
 *
 * Interview Questions:
 * Q1. Difference between next() and nextLine()?
 * Q2. Why close Scanner?
 */

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age);

        // Closing Scanner to avoid memory leak
        sc.close();
    }
}
