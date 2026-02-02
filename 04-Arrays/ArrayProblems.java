/*
 * File: ArrayProblems.java
 *
 * Purpose:
 * Practice common array-based problems asked in interviews.
 *
 * Interview Focus:
 * - Traversal
 * - Max / Min
 * - Reverse array
 */

public class ArrayProblems {

    // Find maximum element in array
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Reverse an array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 8, 2};

        System.out.print("Original Array: ");
        printArray(arr);

        System.out.println("Maximum element: " + findMax(arr));

        reverseArray(arr);

        System.out.print("Reversed Array: ");
        printArray(arr);
    }
}
