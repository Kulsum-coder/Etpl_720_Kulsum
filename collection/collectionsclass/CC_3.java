package com.evergent.corejava.collection.collectionsclass;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 *Collections.reverse()
This method reverses the order of the elements in the specified list.
 */
public class CC_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(13);
        numbers.add(4);
        numbers.add(5);

        // Display the original list
        System.out.println("Original list: " + numbers);

        // Reversing the list
        Collections.reverse(numbers);

        // Display the reversed list
        System.out.println("Reversed list: " + numbers);
    }
}
