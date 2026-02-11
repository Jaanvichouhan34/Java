/*
 * File: SpaceComplexity.java
 *
 * Definition:
 * Space Complexity tells how much extra memory
 * an algorithm uses.
 *
 * Includes:
 * - Input space
 * - Auxiliary space (extra variables, recursion stack)
 */

public class SpaceComplexity {

    // O(1) → Constant Space
    static void constantSpace() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // O(n) → Linear Space
    static void linearSpace(int n) {
        int[] arr = new int[n]; // extra space
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        System.out.println("Array created of size " + n);
    }

    public static void main(String[] args) {

        constantSpace();
        linearSpace(5);
    }
}

//“Space complexity is the memory required by an algorithm apart from input.”