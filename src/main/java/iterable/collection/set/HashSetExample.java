package iterable.collection.set;

/*
* Is used to store unique items
* Can contain null values
* Does not maintain any order of the elements
* HashSet is not thread safe
* */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        // Create a HastSet
        Set<String> pokemons = new HashSet<String>();

        // Adding items
        pokemons.add("Pikachu");
        pokemons.add("Abra");
        pokemons.add("Weedle");
        pokemons.add("Onix");
        pokemons.add("Charmander");
        System.out.println("Printing all items in pokemon: " + pokemons);
        System.out.println("Attempting to add Abra again as a duplicate");
        pokemons.add("Abra");
        System.out.println("Printing all items in pokemon: " + pokemons);

        // Accessing items
        System.out.println("\nPrinting to see if hashSet contains 'Abra'");
        if (pokemons.contains("Abra")) System.out.println("Found Abra");

        // Removing items
        System.out.println("\nPrinting all items in pokemon before removing anythin:     " + pokemons);
        pokemons.remove("Weedle");
        System.out.println("Printing after removing Weedle:                            " + pokemons);
        pokemons.removeIf(pokemon -> pokemon.contains("man"));
        System.out.println("Printing after removing all pokemons that container 'man': " + pokemons);

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
        Set<CustomPokemon> customPokemons = new HashSet<CustomPokemon>();
        customPokemons.add(new CustomPokemon(1000));
        customPokemons.add(new CustomPokemon(2000));
        customPokemons.add(new CustomPokemon(500));
        System.out.println("\nPrinting out customer pokemons: " + customPokemons);
    }
}

class CustomPokemon {

    private int pokemonId;

    public CustomPokemon(int pokemonId) {
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