/*
 * File: Variables.java
 *
 * Definition:
 * Variable is a container used to store data values.
 *
 * Types of Variables:
 * 1. Local variable
 * 2. Instance variable
 * 3. Static variable
 *
 * Interview Questions:
 * Q1. Difference between local and instance variables?
 * Q2. Can a variable start with a number? → NO
 */

public class Variables {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    public static void main(String[] args) {

        // Local variable
        int localVar = 5;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Static Variable: " + staticVar);

        // Creating object to access instance variable
        Variables obj = new Variables();
        System.out.println("Instance Variable: " + obj.instanceVar);
    }
}
