/*
 * File: OneDArray.java
 *
 * Definition:
 * An array is a collection of elements of the SAME data type
 * stored in contiguous memory locations.
 *
 * Why arrays are important in DSA:
 * - Fast access using index (O(1))
 * - Used in almost every DSA problem
 *
 * Interview Questions:
 * Q1. What is the default value of int array? → 0
 * Q2. Array size is fixed or dynamic? → Fixed
 */

public class OneDArray {

    public static void main(String[] args) {

        // Declaration and initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);

        // Traversing array using for loop
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Enhanced for loop (for-each)
        System.out.println("Using for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
