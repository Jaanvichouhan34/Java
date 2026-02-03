/*
 * File: TwoDArray.java
 *
 * Definition:
 * A 2D array is an array of arrays (matrix form).
 *
 * Important Points:
 * - Commonly used in matrix problems
 * - Accessed using row and column indexes
 *
 * Interview Questions:
 * Q1. How to find number of rows? → arr.length
 * Q2. How to find number of columns? → arr[0].length
 */

public class TwoDArray {

    public static void main(String[] args) {

        // Declaration and initialization
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Printing 2D array
        System.out.println("Matrix elements:");

        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
