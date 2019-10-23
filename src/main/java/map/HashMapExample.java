package map;

import java.util.HashMap;

/*
* Stores key value pairs
* */
public class HashMapExample {

    public static void main(String[] args) {
        // Create the Map
        HashMap<String, String> animals = new HashMap<String, String>();

        // Add items to the hashMap
        animals.put("Mammal", "Dog");
        animals.put("Reptile", "King Cobra");
        animals.put("Bird", "Chicken");
        animals.put("Fish", "Tuna");

        // Get specific item
        System.out.println("Printing out all items: " + animals);
        System.out.println("Printing out bird only: " + animals.get("Bird"));

        // Removing an item
        System.out.println("Printing out all items before removing anything: " + animals);
        animals.remove("Fish");
        System.out.println("Printing out all items after removing Fish: " + animals);

        // Print all the keys
        System.out.println("Printing all the keys");
        for (String animal : animals.keySet()) {
            System.out.println(animal);
        }

        // Print all the values
        System.out.println("Printing all the value");
        for (String animal : animals.values()) {
            System.out.println(animal);
        }

        // Removing all items
        System.out.println("Printing out all items before removing them all: " + animals);
        animals.clear();
        System.out.println("Printing out all items after all items have been removed: " + animals);
    }
}
