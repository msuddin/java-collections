package iterable.collection.list.vector;

/*
* Is a last in first out data structure
* Supports push and pop operations
* */

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> pokemons = new Stack<>();

        // Add items
        pokemons.push("pikachu");
        pokemons.push("starmie");
        pokemons.push("onix");
        pokemons.push("balbusaur");
        pokemons.push("ferrow");
        System.out.println("Printing all items in Stack: " + pokemons);

        // Removing items
        System.out.println("\nPreparing to remove last item on list");
        pokemons.pop();
        System.out.println("Printing all items in Stack: " + pokemons);

        // Get the item at the top of the list
        System.out.println("\nPrinting all items in Stack:              " + pokemons);
        System.out.println("Printing item at the bottom of the Stack: " + pokemons.peek());

        // Search for an item
        System.out.println("\nWhat index value is onix in: " + pokemons.search("onix"));

        // Iterate over
        System.out.println("\nPrinting all items using forEach");
        pokemons.forEach(poke -> System.out.println(poke));

        System.out.println("Printing all items using iterator");
        Iterator<String> pokemonIterator = pokemons.iterator();
        while (pokemonIterator.hasNext()) {
            String name = pokemonIterator.next();
            System.out.println(name);
        }
    }
}
