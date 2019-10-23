package iterable.collection.set;

/*
* Items in a TreeSet are automatically ordered in natural order of keys
* During instantiation you can provide a Comparator for custom ordering
* Cannot contain duplicate elements
* TreeSet is not thread safe
* TreeSet uses TreeMap under the hood
* */

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create TreeSet
        SortedSet<String> pokemons = new TreeSet<>();

        // Adding items
        pokemons.add("pikachu");
        pokemons.add("charmander");
        pokemons.add("torous");
        pokemons.add("lapras");
        pokemons.add("butterfree");
        System.out.println("Printing out the list of items in pokemons:      " + pokemons);

        // Providing Comparator for custom order
        pokemons = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        pokemons.add("pikachu");
        pokemons.add("charmander");
        pokemons.add("torous");
        pokemons.add("weedle");
        pokemons.add("ditto");
        pokemons.add("lapras");
        pokemons.add("butterfree");
        System.out.println("Printing list after sorting in desendcing order: " + pokemons);

        // Accessing
        System.out.println("\nPrinting out the list of items in pokemons: " + pokemons);
        System.out.println("Does list contain Lapras?");
        if (pokemons.contains("lapras")) {
            System.out.println("Lapras has been found!");
        }
        System.out.println("First item in the list is:                 " + pokemons.first());
        System.out.println("Last item in the list is:                  " + pokemons.last());

        // Removing items from the set
        System.out.println("\nPrinting out the list of items in pokemons   " + pokemons);
        pokemons.remove("lapras");
        System.out.println("Printing out the list after removing lapras: " + pokemons);
        System.out.println("Removing any pokemon that contains 'er'");
        pokemons.removeIf(pokemon -> pokemon.contains("er"));
        System.out.println("Printing out the list after removing :       " + pokemons);
        ((TreeSet<String>) pokemons).pollFirst();
        System.out.println("Printing list after removing first pokemon:  " + pokemons);
        ((TreeSet<String>) pokemons).pollLast();
        System.out.println("Printing list after removing last pokemon:   " + pokemons);

        // Instantiating again pokemon list with custom object
        SortedSet<TrainerPokemonCombo> customPokemons = new TreeSet<TrainerPokemonCombo>();

        // Add
        customPokemons.add(new TrainerPokemonCombo(5, "Pikachu"));
        customPokemons.add(new TrainerPokemonCombo(15, "Lapras"));
        customPokemons.add(new TrainerPokemonCombo(25, "Abra"));
        System.out.println("\nPrinting out customPokemon list based on compareTo():       " + customPokemons);

        customPokemons = new TreeSet<TrainerPokemonCombo>(Comparator.comparing(TrainerPokemonCombo::getPokemonName));
        customPokemons.add(new TrainerPokemonCombo(5, "Pikachu"));
        customPokemons.add(new TrainerPokemonCombo(15, "Lapras"));
        customPokemons.add(new TrainerPokemonCombo(25, "Abra"));
        System.out.println("Printing out customPokemon list based on custom Comparator: " + customPokemons);
    }
}

class TrainerPokemonCombo implements Comparable<TrainerPokemonCombo>{

    private int trainerId;
    private String pokemonName;

    public TrainerPokemonCombo(int trainerId, String pokemonName) {
        this.trainerId = trainerId;
        this.pokemonName = pokemonName;
    }

    public void setTrainerId(int newTrainerId) {
        this.trainerId = newTrainerId;
    }

    public void setPokemonName(String newPokemonName) {
        this.pokemonName = newPokemonName;
    }

    public int getTrainerId() {
        return this.trainerId;
    }

    public String getPokemonName() {
        return this.pokemonName;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerPokemonCombo trainerPokemonCombo = (TrainerPokemonCombo) o;
        return this.trainerId == trainerPokemonCombo.trainerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId);
    }

    @Override
    public int compareTo(TrainerPokemonCombo trainerPokemonCombo) {
        return this.getTrainerId() - trainerPokemonCombo.getTrainerId();
    }

    public String toString() {
        return "Pokemon{" +
                "trainerId=" + this.getTrainerId() +
                ", pokemonName='" + this.getPokemonName() + '\'' +
                '}';
    }
}