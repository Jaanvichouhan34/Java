/*
 * File: StringBasics.java
 *
 * Definition:
 * String is a sequence of characters.
 * In Java, String is an IMMUTABLE object.
 *
 * Important Points:
 * - Stored in String Constant Pool (SCP)
 * - Once created, cannot be changed
 *
 * Interview Questions:
 * Q1. Difference between == and equals()?
 * Q2. Why String is immutable?
 */

public class StringBasics {

    public static void main(String[] args) {

        // String literals (stored in SCP)
        String s1 = "Java";
        String s2 = "Java";

        // String objects (stored in heap)
        String s3 = new String("Java");

        // == checks reference
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // equals() checks content
        System.out.println(s1.equals(s3)); // true

        // String methods
        String str = "Data Structures";

        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring: " + str.substring(0, 4));
        System.out.println("Contains 'Data'? " + str.contains("Data"));
    }
}
