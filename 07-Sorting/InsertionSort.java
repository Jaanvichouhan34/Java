/*
 * File: InsertionSort.java
 *
 * Definition:
 * Insertion Sort builds the sorted array one element
 * at a time by inserting elements in their correct position.
 *
 * Best for:
 * - Small datasets
 * - Nearly sorted arrays
 *
 * Time Complexity:
 * - Best Case: O(n)
 * - Average/Worst Case: O(n^2)
 *
 * Space Complexity:
 * - O(1)
 *
 * Interview Questions:
 * Q1. Is Insertion Sort stable? → YES
 * Q2. Why is it efficient for small data?
 */

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key in correct position
            arr[j + 1] = key;
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

        int[] arr = {9, 5, 1, 4, 3};

        System.out.print("Before Sorting: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("After Sorting: ");
        printArray(arr);
    }
}
