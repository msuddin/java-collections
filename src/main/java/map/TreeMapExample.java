package map;

/*
* Always sorted based on the natural order of the items inside the mao
* Ordering can be customer by providing a comparator at map instantiation
* Can not contain duplicate keys
* Can not contain any null keys but can have null values
* TreeMap is not thread safe
* */

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Create a tree map
        SortedMap<String, String> pokemons = new TreeMap<String, String>();

        // Add items to the map
        pokemons.put("fire", "charmander");
        pokemons.put("water", "squartle");
        pokemons.put("grass", "bulbusaur");
        pokemons.put("electric", "pikachu");
        System.out.println("Printing out all pokemons: " + pokemons);

        // Creating with a custom Comparator
        System.out.println("\nReinitializing the same list with a custom comparator to return in decending order");
        pokemons = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        pokemons.put("fire", "charmander");
        pokemons.put("water", "squartle");
        pokemons.put("grass", "bulbusaur");
        pokemons.put("electric", "pikachu");
        pokemons.put("rock", "onix");
        pokemons.put("normal", "rattata");
        System.out.println("After custom sort: " + pokemons);

        // Accessing items
        System.out.println("\nPrinting out all items:                " + pokemons);
        System.out.println("Printing item with water key index:    " + pokemons.get("water"));
        System.out.println("Printing first key element in the map: " + pokemons.firstKey());
        System.out.println("Printing last key element in the map:  " + pokemons.lastKey());
        Map.Entry<String, String> pokemonJustAbove = ((TreeMap<String, String>) pokemons).higherEntry("grass");
        System.out.println("Printing pokemon just above 'grass':   " + pokemonJustAbove);
        Map.Entry<String, String> pokemonJustBelow = ((TreeMap<String, String>) pokemons).lowerEntry("grass");
        System.out.println("Printing pokemon just below 'grass':   " + pokemonJustBelow);

        // Removing Entries
        System.out.println("\nBefore removing anything, the list current has:         " + pokemons);
        pokemons.remove("rock");
        System.out.println("Removing rock type pokemon, list now contains:          " + pokemons);
        pokemons.remove("grass", "bulbusaur");
        System.out.println("Removing grass pokmeon if grass key contains bulbusaur: " + pokemons);
        ((TreeMap<String, String>) pokemons).pollFirstEntry();
        System.out.println("After removing first entry:                             " + pokemons);
        ((TreeMap<String, String>) pokemons).pollLastEntry();
        System.out.println("After removing last entry:                              " + pokemons);
    }
}
