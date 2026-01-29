/*
 * File: DataTypes.java
 *
 * Definition:
 * Data type specifies the size and type of values
 * that a variable can store.
 *
 * Types:
 * 1. Primitive
 * 2. Non-Primitive
 *
 * Primitive Data Types:
 * byte, short, int, long, float, double, char, boolean
 *
 * Interview Questions:
 * Q1. Default value of int? → 0 (only for instance variables)
 * Q2. Size of int? → 4 bytes
 */

public class DataTypes {

    public static void main(String[] args) {

        // Primitive data types
        int age = 21;
        double cgpa = 8.5;
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
    }
}
