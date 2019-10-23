package iterable.collection.list;

/*
* Maintains insertion order
* It is a dynamic array that can grow
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

        // Iterating over Vectors
        System.out.println("\nPrinting all vectors using Iterator");
        Iterator<String> pokemonIterator = pokemons.iterator();
        while(pokemonIterator.hasNext()) {
            String pokemon = pokemonIterator.next();
            System.out.println(pokemon);
        }
    }
}
