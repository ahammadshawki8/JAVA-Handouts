import java.util.HashMap; // Importing HashMap class from java.util package

public class hashmaps {
    public static void main(String[] args) {
        // HashMap declaration and initialization
        HashMap<String, Integer> map = new HashMap<>(); // Empty HashMap

        // Adding elements to the HashMap
        map.put("one", 1); // Adding key-value pair
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        // Print HashMap elements
        System.out.println("HashMap: " + map); // Print entire HashMap

        // Accessing elements in the HashMap
        System.out.println("Value for key 'two': " + map.get("two")); // Accessing value by key

        // Accessing a non-existing key
        System.out.println("Value for key 'six': " + map.get("six"));
        System.out.println("Value for key 'six' (default): " + map.getOrDefault("six", -1));  

        // Size of the HashMap
        System.out.println("HashMap size: " + map.size()); // Size of the HashMap

        // updating an element in the HashMap
        map.replace("two", 22);
        System.out.println("Updated value for key 'two': " + map.get("two")); // Print updated value 

        // Removing an element from the HashMap
        String keyToRemove = "three"; 
        map.remove(keyToRemove); // Removing an element by key
        System.out.println("HashMap after removing key '" + keyToRemove + "': " + map); // Print after removal

        // Checking if a key exists in the HashMap
        boolean containsKey = map.containsKey("four"); // Checking if the HashMap contains a key
        System.out.println("HashMap contains key 'four': " + containsKey); // Print result

        // Checking if a value exists in the HashMap
        boolean containsValue = map.containsValue(5); // Checking if the HashMap contains a value
        System.out.println("HashMap contains value 5: " + containsValue); // Print result 

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap: ");
        for (String key : map.keySet()) { // Iterating over keys
            System.out.println(key + ": " + map.get(key)); // Print key-value pairs
        }

        // forEach loop to iterate over the HashMap
        System.out.println("Using forEach loop: ");
        map.forEach((key, value) -> { // Using forEach method to iterate
            System.out.println(key + ": " + value); // Print key-value pairs
        });

        // Clear the HashMap
        map.clear(); 

        // checking if the HashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty); 
        
    }
}
