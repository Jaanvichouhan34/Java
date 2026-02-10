/*
 * File: StackExample.java
 *
 * Definition:
 * Stack follows LIFO (Last In First Out).
 *
 * Why important in DSA:
 * - Used in recursion
 * - Expression evaluation
 *
 * Interview Questions:
 * Q1. Difference between Stack and Queue?
 */

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Popped: " + stack.pop());

        // Stack after pop
        System.out.println("Stack elements: " + stack);
    }
}


//🎯 What interviewers REALLY check in Collections

// Why use ArrayList over Array?

// When to use HashMap vs TreeMap

// Time complexity of operations

// Real DSA usage (frequency map, BFS, stack recursion)