/*
 * File: ArrayListExample.java
 *
 * Definition:
 * ArrayList is a resizable array implementation of List interface.
 *
 * Why important in DSA:
 * - Dynamic size
 * - Fast random access
 *
 * Interview Questions:
 * Q1. Difference between Array and ArrayList?
 * Q2. Is ArrayList synchronized? → NO
 */

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Updating element
        list.set(1, 25);

        // Removing element
        list.remove(0);

        // Iterating through list
        System.out.println("ArrayList elements:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
