/*
 * File: HashMapExample.java
 *
 * Definition:
 * HashMap stores data in key-value pairs.
 *
 * Why important in DSA:
 * - Used in frequency counting
 * - Fast lookup O(1) average
 *
 * Interview Questions:
 * Q1. Can HashMap have null key? → YES (one)
 * Q2. Is HashMap ordered? → NO
 */

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        // Creating HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);

        // Access value
        System.out.println("Apple count: " + map.get("Apple"));

        // Iterating through HashMap
        System.out.println("All elements:");
        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}
