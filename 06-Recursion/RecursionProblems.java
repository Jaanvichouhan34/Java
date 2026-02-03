/*
 * File: RecursionProblems.java
 *
 * Purpose:
 * Practice common recursion problems asked in interviews.
 *
 * Interview Focus:
 * - Base case clarity
 * - Stack understanding
 * - Time complexity
 */

public class RecursionProblems {

    // Fibonacci using recursion
    public static int fibonacci(int n) {

        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of digits using recursion
    public static int sumOfDigits(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive call
        return (n % 10) + sumOfDigits(n / 10);
    }

    // Check if array is sorted using recursion
    public static boolean isSorted(int[] arr, int index) {

        // Base case
        if (index == arr.length - 1) {
            return true;
        }

        // If current element > next element
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive call
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        int n = 6;
        System.out.println("Fibonacci of " + n + ": " + fibonacci(n));

        int num = 1234;
        System.out.println("Sum of digits: " + sumOfDigits(num));

        int[] arr = {1, 2, 3, 5, 4};
        System.out.println("Is array sorted? " + isSorted(arr, 0));
    }
}
