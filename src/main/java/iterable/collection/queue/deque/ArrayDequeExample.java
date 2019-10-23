package iterable.collection.queue.deque;

/*
* Is a resizable array
* Can grow to any given size to support content
* Not thread safe
* Null values are not allowed
* */

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        // Creating ArrayDeque
        Deque<String> pokemons = new ArrayDeque<String>();

        // Add items
        pokemons.add("pikachu");
        pokemons.add("squartle");
        pokemons.add("buterfree");
        pokemons.add("pidgey");
        pokemons.add("balbusaur");
        pokemons.add("weedle");
        pokemons.add("abra");
        System.out.println("Printing all items in ArrayDeque: " + pokemons);

        // Getting elements
        System.out.println("\nPrinting the first element in the list: " + pokemons.getFirst());
        System.out.println("Printing the last element in the list:  " + pokemons.getLast());

        // Removing elements from the list
        System.out.println("\nPrinting all elements before removing anything:            " + pokemons);
        pokemons.removeFirst();
        System.out.println("Printing all elements after removing first element:        " + pokemons);
        pokemons.removeLast();
        System.out.println("Printing all elements after removing last element:         " + pokemons);
        pokemons.remove(1);
        System.out.println("Printing all elements after removing 2nd element:          " + pokemons);
        pokemons.removeIf(heroName -> heroName.contains("weedle"));
        System.out.println("Printing all elements after removing any 'weedle' Element: " + pokemons);

        // Peeking items
        System.out.println("\nPrinting all items in ArrayDeque: " + pokemons);
        System.out.println("Peeking first item:               " + pokemons.peek());
        System.out.println("Peeking first item:               " + pokemons.peekFirst());
        System.out.println("Peeking last item:                " + pokemons.peekLast());
    }
}
