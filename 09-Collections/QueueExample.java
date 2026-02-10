/*
 * File: QueueExample.java
 *
 * Definition:
 * Queue follows FIFO (First In First Out).
 *
 * Why important in DSA:
 * - Used in BFS
 * - Scheduling problems
 *
 * Interview Questions:
 * Q1. Which class implements Queue? → LinkedList
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Remove element
        System.out.println("Removed: " + queue.remove());

        // Queue after removal
        System.out.println("Queue elements: " + queue);
    }
}

