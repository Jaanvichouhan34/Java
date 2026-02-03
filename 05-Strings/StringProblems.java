/*
 * File: StringProblems.java
 *
 * Purpose:
 * Practice common string problems asked in interviews.
 *
 * Interview Focus:
 * - Reverse string
 * - Palindrome check
 * - Character frequency
 */

public class StringProblems {

    // Reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Check if palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "level";

        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reverseString(s));
        System.out.println("Is Palindrome? " + isPalindrome(s));
    }
}
