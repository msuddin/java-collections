package iterable.collection.set;

/*
* Double linked list i.e. each item is a node in the list where each node contains:
*  - the data
*  - a reference to the previous node
*  - a reference to the next node
* Contains unique elements
* Does not allow null elements
* Maintains insertion order
* */

import java.util.*;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // Create Set
        LinkedHashSet<String> pokemons = new LinkedHashSet<>();

        // Add items
        pokemons.add("pikachu");
        pokemons.add("squartle");
        pokemons.add("balbusaur");
        pokemons.add("onix");
        pokemons.add("weedle");
        pokemons.add("abra");
        System.out.println("Printing out all items: " + pokemons);

        // Accessing items
        System.out.println("\nPrinting to see if hashSet contains 'Abra'");
        if (pokemons.contains("abra")) System.out.println("Found Abra");

        // Removing items
        System.out.println("\nPrinting all items in pokemon before removing anything:    " + pokemons);
        pokemons.remove("weedle");
        System.out.println("Printing after removing Weedle:                            " + pokemons);
        pokemons.removeIf(pokemon -> pokemon.contains("bus"));
        System.out.println("Printing after removing all pokemons that container 'bus': " + pokemons);

        // Iterating over HashSet
        System.out.println("\nPrinting using forEach");
        pokemons.forEach(poke -> System.out.println(poke));
        System.out.println("Printing using an iterator");
        Iterator<String> pokemonIterator = pokemons.iterator();
        while (pokemonIterator.hasNext()) {
            String name = pokemonIterator.next();
            System.out.println(name);
        }

        // HashSet with custom object
        Set<CustomPokemonObject> customPokemonObject = new HashSet<CustomPokemonObject>();
        customPokemonObject.add(new CustomPokemonObject(1000));
        customPokemonObject.add(new CustomPokemonObject(2000));
        customPokemonObject.add(new CustomPokemonObject(500));
        System.out.println("\nPrinting out customer pokemons: " + customPokemonObject);
    }
}

class CustomPokemonObject {

    private int pokemonId;

    public CustomPokemonObject(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public void setName(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public int getId() {
        return this.pokemonId;
    }

    @Override
    public String toString() {
        return "Pokemon{id=" + this.pokemonId + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomPokemon customPokemon = (CustomPokemon) o;
        return this.pokemonId == customPokemon.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.pokemonId);
    }
}