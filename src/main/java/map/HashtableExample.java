package map;

/*
* Can contain null keys and null values
* It is thread safe
* */

import java.util.Hashtable;

public class HashtableExample {

    public static void main(String[] args) {
        // Create Hash Table
        Hashtable<String, String> pokemons = new Hashtable<>();

        // Add Items
        pokemons.put("grass", "balbusaur");
        pokemons.put("water", "squartle");
        pokemons.put("eletric", "pichu");
        pokemons.put("rock", "onix");
        pokemons.put("normal", "jiggipuff");
        System.out.println("Printing all items in hash table: " + pokemons);

        // Get specific item
        System.out.println("\nPrinting out all items: " + pokemons);
        System.out.println("Printing out bird only: " + pokemons.get("water"));

        // Removing an item
        System.out.println("\nPrinting out all items before removing anything: " + pokemons);
        pokemons.remove("normal");
        System.out.println("Printing out all items after removing normal: " + pokemons);

        // Print all the keys
        System.out.println("\nPrinting all the keys");
        for (String animal : pokemons.keySet()) {
            System.out.println(animal);
        }

        // Print all the values
        System.out.println("Printing all the value");
        for (String animal : pokemons.values()) {
            System.out.println(animal);
        }

        // Removing all items
        System.out.println("\nPrinting out all items before removing them all: " + pokemons);
        pokemons.clear();
        System.out.println("Printing out all items after all items have been removed: " + pokemons);
    }
}
