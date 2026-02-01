/*
 * File: PatternProblems.java
 *
 * Definition:
 * Pattern problems improve logical thinking
 * and loop understanding.
 *
 * Interview Importance:
 * - Asked in coding rounds
 * - Tests nested loops understanding
 */

public class PatternProblems {

    public static void main(String[] args) {

        int n = 5;

        /*
         * Pattern 1:
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * Pattern 2:
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * Pattern 3:
         * * * * *
         * * * *
         * * *
         * *
         */
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
