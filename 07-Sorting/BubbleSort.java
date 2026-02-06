/*
 * File: BubbleSort.java
 *
 * Definition:
 * Bubble Sort is a simple comparison-based sorting algorithm
 * where adjacent elements are repeatedly swapped if they are
 * in the wrong order.
 *
 * How it works:
 * - Largest element "bubbles up" to the end in each pass
 *
 * Time Complexity:
 * - Best Case: O(n) (already sorted)
 * - Average Case: O(n^2)
 * - Worst Case: O(n^2)
 *
 * Space Complexity:
 * - O(1) (in-place)
 *
 * Interview Questions:
 * Q1. Is Bubble Sort stable? → YES
 * Q2. Is it in-place? → YES
 */

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;
            }
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

        int[] arr = {5, 1, 4, 2, 8};

        System.out.print("Before Sorting: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("After Sorting: ");
        printArray(arr);
    }
}
