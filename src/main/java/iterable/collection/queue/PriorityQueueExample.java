package iterable.collection.queue;

/*
* Items are automatically ordered based on the natural ordering of the items
* Can order using a custom Comparator
* Front of the queue contains the least element whilst rear of the queue contains the greatest
* */

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Creating a Priority Queue
        PriorityQueue<String> pokemons = new PriorityQueue<>();

        // Adding items
        pokemons.add("Pikachua");
        pokemons.add("Squartle");
        pokemons.add("Weedle");
        pokemons.add("Abra");
        pokemons.add("Gengar");
        pokemons.add("Lapras");
        System.out.println("Printing all items in the queue: " + pokemons);

        // Removing items in the queue
        System.out.println("\nRemoving items");
        while (!pokemons.isEmpty()) {
            System.out.println("About to remove: " + pokemons.remove());
        }
    }
}
