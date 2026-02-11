/*
 * File: TimeComplexity.java
 *
 * Definition:
 * Time Complexity tells how much time an algorithm takes
 * as input size (n) increases.
 *
 * Why important:
 * - Helps choose efficient algorithms
 * - Interviewers ALWAYS ask this
 */

public class TimeComplexity {

    // O(1) → Constant Time
    static void constantTime(int n) {
        System.out.println("Constant time operation");
    }

    // O(n) → Linear Time
    static void linearTime(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // O(n^2) → Quadratic Time
    static void quadraticTime(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;

        constantTime(n);
        linearTime(n);
        quadraticTime(n);
    }
}

//“Time complexity measures how execution time grows with input size.”


