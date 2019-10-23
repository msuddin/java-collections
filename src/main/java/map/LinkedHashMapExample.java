package map;

/*
* Is a hash table that is double linked i.e. an item is a node where each node contains:
*  - The data
*  - A reference to it's previous node
*  - A reference to it's next node
* Produces a more predictable order of the items
* Cannot contain any duplicate keys
* Can contain both null keys and null values
* Is not thread safe
* */

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, String> pokemons = new LinkedHashMap<>();

        // Add Items
        pokemons.put("eletric", "pikachu");
        pokemons.put("fire", "charmander");
        pokemons.put("water", "magikarp");
        pokemons.put("grass", "balbusaur");
        pokemons.put("rock", "onix");
        pokemons.put("normal", "torous");
        System.out.println("Printing all pokemons in linked hash map: " + pokemons);

        // Accessing Items
        System.out.println("\nPrinting out all pokemon:   " + pokemons);
        System.out.println("Printing out onix:          " + pokemons.get("rock"));
        System.out.println("Is Rock a key");
        if(pokemons.containsKey("rock")) System.out.println("Rock was found");
        if(pokemons.containsValue("onix")) System.out.println("Onix was found");
        System.out.println("Changing the value of Onix to Geodude");
        pokemons.put("rock", "Geodude");
        System.out.println("Printing out all pokemon:   " + pokemons);

        // Removing items
        System.out.println("\nPrinting out all pokemon:                        " + pokemons);
        pokemons.remove("water");
        System.out.println("Printing out all pokemon after removing water:   " + pokemons);

        // Iterating over the LinkedHasMap
        System.out.println("\nPrinting all items using foreach");
        pokemons.forEach((type, name) -> System.out.println(type + ", " + name));
        System.out.println("Printing all items using an Iterator");
        Iterator<Map.Entry<String, String>> pokemonIterator = pokemons.entrySet().iterator();
        while(pokemonIterator.hasNext()) {
            Map.Entry<String, String> pokemon = pokemonIterator.next();
            System.out.println(pokemon.getKey() + ", " + pokemon.getValue());
        }

    }
}
