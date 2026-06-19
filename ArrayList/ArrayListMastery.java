package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMastery {
    public static void main(String[] args) {
        
        // 1. INITIALIZATION & CREATION
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. INSERTION METHODS
        System.out.println("--- 1. Insertion ---");
        fruits.add("Apple");       // Adds to the end
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1, "Orange");  // Inserts "Orange" at index 1 (shifts others right)
        
        ArrayList<String> exoticFruits = new ArrayList<>();
        exoticFruits.add("Kiwi");
        exoticFruits.add("Dragonfruit");
        fruits.addAll(exoticFruits); // Appends an entire collection to the end
        
        System.out.println("Current List: " + fruits);

        // 3. ACCESS METHODS
        System.out.println("\n--- 2. Accessing Elements ---");
        String favorite = fruits.get(2); // Gets element at index 2 (0-indexed)
        int totalElements = fruits.size(); // Gets total count of elements
        
        System.out.println("Element at index 2: " + favorite);
        System.out.println("Total size of the list: " + totalElements);

        // 4. MODIFICATION METHODS
        System.out.println("\n--- 3. Modification ---");
        fruits.set(0, "Avocado"); // Replaces element at index 0 with "Avocado"
        System.out.println("After replacement: " + fruits);

        // 5. SEARCHING & CHECKING METHODS
        System.out.println("\n--- 4. Searching & Checking ---");
        boolean hasMango = fruits.contains("Mango"); // Checks if element exists (returns boolean)
        int firstIndexOfBanana = fruits.indexOf("Banana"); // Finds first occurrence index
        boolean isEmptyList = fruits.isEmpty(); // Checks if list has 0 elements
        
        System.out.println("Contains 'Mango'?: " + hasMango);
        System.out.println("Index of 'Banana': " + firstIndexOfBanana);
        System.out.println("Is the list empty?: " + isEmptyList);

        // 6. SORTING AND UTILITIES (using Collections class)
        System.out.println("\n--- 5. Sorting & Utilities ---");
        Collections.sort(fruits); // Sorts alphabetically (Ascending)
        System.out.println("Sorted Ascending: " + fruits);
        
        Collections.reverse(fruits); // Reverses the current order
        System.out.println("Reversed List: " + fruits);

        // 7. ITERATION (3 Different Ways to loop)
        System.out.println("\n--- 6. Iteration Methods ---");
        // Way A: Enhanced For-Loop (Most Common)
        System.out.print("For-each loop: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " | ");
        }
        System.out.println();
        
        // Way B: Java 8+ ForEach with Lambda (Sleekest)
        System.out.print("Lambda forEach: ");
        fruits.forEach(fruit -> System.out.print(fruit + " -> "));
        System.out.println();

        // 8. DELETION / REMOVAL METHODS
        System.out.println("\n--- 7. Deletion ---");
        fruits.remove(1);          // Removes element at index 1
        fruits.remove("Kiwi");      // Removes the first occurrence of object "Kiwi"
        
        System.out.println("After removing index 1 and 'Kiwi': " + fruits);
        
        fruits.clear(); // Wipes out everything inside the list
        System.out.println("After clear(), final size: " + fruits.size());
    }
}
