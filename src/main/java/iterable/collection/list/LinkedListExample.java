package iterable.collection.list;

/*
* Is a double linked list i.e. each item is a node that contains three things:
*  - 1. the data,
*  - 2. a reference to the previous node
*  - 3. a reference to the next node
* Linked list maintains the order of the items that were added to it
* Since each node contains three sets of data, a linkedList stores more data than an ArrayList
* LinkedList are faster than arrayList since items inserted into arrayList would need all items to be shifter
* Can contain duplicate items
* */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> names = new LinkedList<String>();

        // Adding items
        names.add("Batman");
        names.add("Superman");
        names.add("Wonder Women");
        names.add("Green Lanturn");
        System.out.println("Printing out all elements in the LinkedList: " + names);

        // Adding an item to the beginning, middle and end of a LinkedList
        System.out.println("\nPrinting out all elements before adding to the beginning of the list: " + names);
        names.addFirst("Robin");
        System.out.println("Printing out all elements after adding to the beginning of the list:  " + names);
        System.out.println("Printing out all elements before adding to the end of the list: " + names);
        names.addLast("Spiderman");
        System.out.println("Printing out all elements after adding to the end of the list:  " + names);
        System.out.println("Printing out all elements before adding to in the middle of the list: " + names);
        names.add(Math.round(names.size() / 2), "Black Panther");
        System.out.println("Printing out all elements after adding to in the middle of the list:  " + names);

        // Getting elements
        System.out.println("\nPrinting the first element in the list: " + names.getFirst());
        System.out.println("Printing the last element in the list:  " + names.getLast());
        System.out.println("Printing the 3rd element in the list:   " + names.get(3));

        // Removing elements from the list
        System.out.println("\nPrinting all elements before removing anything:             " + names);
        names.removeFirst();
        System.out.println("Printing all elements after removing first element:         " + names);
        names.removeLast();
        System.out.println("Printing all elements after removing last element:          " + names);
        names.remove(1);
        System.out.println("Printing all elements after removing 2nd element:           " + names);
        names.removeIf(heroName -> heroName.contains("Panther"));
        System.out.println("Printing all elements after removing any 'Panther' Element: " + names);

        // Finding elements
        System.out.println("\nPrinting all elements before trying to perform searches: " + names);
        System.out.println("Does list contain Wonder Women: " + names.contains("Wonder Women"));
        names.add(1, "nullMan");
        names.add(names.size() - 1, "nullMan");
        System.out.println("Adding duplicate copies of 'nullMan' to the beginning and end of the list");
        System.out.println("Printing all elements before trying to perform searches: " + names);
        System.out.println("First instance that 'nullMan' appears is: " + names.indexOf("nullMan"));
        System.out.println("Last instance that 'nullMan' appears is : " + names.lastIndexOf("nullMan"));

        // Printing all items in the list
        System.out.println("\nPrinting using forEach");
        names.forEach(heroName -> System.out.println(heroName));

        System.out.println("\nPrinting using Iterator");
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
        }
    }

}
