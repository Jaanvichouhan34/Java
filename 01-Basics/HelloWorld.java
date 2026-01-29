/*
 * File: HelloWorld.java
 *
 * Definition:
 * This is the simplest Java program used to understand
 * the basic structure of a Java application.
 *
 * Important Points:
 * - Every Java program starts execution from main() method
 * - class name and file name must be SAME
 * - Java is case-sensitive
 *
 * Interview Questions:
 * Q1. Why is main method static?
 * → So JVM can call it without creating an object.
 *
 * Q2. Why void?
 * → main does not return anything to JVM.
 */

public class HelloWorld {

    // main method: entry point of Java program
    public static void main(String[] args) {

        // Prints output and moves cursor to new line
        System.out.println("Hello, World!");

        // Prints output without new line
        System.out.print("Welcome to Java for DSA");
    }
}
