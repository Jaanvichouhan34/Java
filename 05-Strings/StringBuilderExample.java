/*
 * File: StringBuilder.java
 *
 * Definition:
 * StringBuilder is a mutable sequence of characters.
 *
 * Why StringBuilder is important in DSA:
 * - Faster than String for modifications
 * - Avoids unnecessary object creation
 *
 * Interview Questions:
 * Q1. Difference between String and StringBuilder?
 * Q2. Is StringBuilder thread-safe? → NO
 */

public class StringBuilderExample {

    public static void main(String[] args) {

        // Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append operation
        sb.append(" World");
        System.out.println(sb);

        // Insert operation
        sb.insert(5, ",");
        System.out.println(sb);

        // Replace operation
        sb.replace(0, 5, "Hi");
        System.out.println(sb);

        // Delete operation
        sb.delete(2, 4);
        System.out.println(sb);

        // Reverse string
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
