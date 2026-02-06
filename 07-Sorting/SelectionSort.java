/*
 * File: SelectionSort.java
 *
 * Definition:
 * Selection Sort selects the minimum element from the
 * unsorted part and places it at the beginning.
 *
 * Time Complexity:
 * - Best/Average/Worst Case: O(n^2)
 *
 * Space Complexity:
 * - O(1)
 *
 * Interview Questions:
 * Q1. Is Selection Sort stable? → NO
 * Q2. Number of swaps? → At most (n - 1)
 */

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through array
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap with first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Before Sorting: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("After Sorting: ");
        printArray(arr);
    }
}
