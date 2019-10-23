package iterable.collection.list;

import java.util.ArrayList;
import java.util.Collections;

/*
* Is a resizable array i.e. you can add or remove items at will without having to create another array
* */
public class ArrayListExample {

    public static void main(String[] args) {
        // Create the list
        ArrayList<String> names = new ArrayList<String>();

        // Add items to the list
        names.add("Batman");
        names.add("Superman");
        names.add("Wonder Women");
        names.add("Green Arrow");
        System.out.println("Printing out names at point of just creating the array");
        System.out.println(names);

        // Get specific item in the array
        System.out.println("Printing out item at index position 2: " + names.get(1));

        // Modify an item in the list
        System.out.println("Going to change the value of Superman to Superwomen");
        System.out.println("Before change: " + names.get(1));
        names.set(1, "Supermanwomen");
        System.out.println("After change: " + names.get(1));

        // Remove an item from the array
        System.out.println("Before removing any item: " + names);
        names.remove(0);
        System.out.println("After removing Batman: " + names);

        // Sorting an ArrayList
        System.out.println("Before sorting the names: " + names);
        Collections.sort(names);
        System.out.println("After sorting the names: " + names);

        // Remove all items from the array
        System.out.println("Before removing all items from the array: " + names);
        names.clear();
        System.out.println("After removing all items from the array: " + names);
    }
}
