package iterable.collection.list;

/*
* Maintains insertion order
* It is a dynamic array that can grow and shrink based on the current elements
* It is thread safe
* */

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        // Create a Vector
        Vector<String> pokemons = new Vector<>();

        // Add items
        pokemons.add("pikachu");
        pokemons.add("onix");
        pokemons.add("abra");
        pokemons.add("lapras");
        pokemons.add("charmander");
        System.out.println("Printing all items in Vector: " + pokemons);
        System.out.println("Adding an item in index position 3");
        pokemons.add(2, "geodude");
        System.out.println("Printing all items in Vector: " + pokemons);

        // Increasing and descreasing vector size
        System.out.println("\nPrinting all items in Vector: " + pokemons);
        System.out.println("Printing current vector size: " + pokemons.size());
        System.out.println("Printing current vector capacity: " + pokemons.capacity());
        System.out.println("Adding in new pokemons");
        pokemons.add("jinkx");
        pokemons.add("diglett");
        pokemons.add("unknown");
        pokemons.add("entie");
        pokemons.add("electrode");
        System.out.println("Printing all items in Vector: " + pokemons);
        System.out.println("Printing current vector size: " + pokemons.size());
        System.out.println("Printing current vector capacity: " + pokemons.capacity());
        System.out.println("Removing items to now see both size and capacity to reduce");
        pokemons.remove("unknown");
        pokemons.removeIf(pok -> pok.contains("e"));
        System.out.println("Printing all items in Vector: " + pokemons);
        System.out.println("Printing current vector size: " + pokemons.size());
        System.out.println("Printing current vector capacity: " + pokemons.capacity());

        // Iterating over Vectors
        System.out.println("\nPrinting all vectors using Iterator");
        Iterator<String> pokemonIterator = pokemons.iterator();
        while(pokemonIterator.hasNext()) {
            String pokemon = pokemonIterator.next();
            System.out.println(pokemon);
        }
    }
}
