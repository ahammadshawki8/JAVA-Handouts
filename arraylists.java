import java.util.ArrayList; // Importing the ArrayList class
import java.util.Comparator; // Importing the Collections class for utility methods

public class arraylists {
    public static void main(String[] args) {
        // ArrayList declaration and initialization
        ArrayList<Integer> arr1 = new ArrayList<>(); // Empty ArrayList
        // here <Integer> is the type of elements in the ArrayList, which can be any object type, including user-defined types.
        // this is a wrapper class for int primitive type, so we can use it in the ArrayList.
        // we can also use other wrapper classes like Double, Character, Boolean, etc.


        arr1.add(1); // Adding elements to the ArrayList
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        // Print ArrayList elements
        System.out.println("ArrayList 1: " + arr1);
        System.out.println("ArrayList 1: " + arr1.toString()); // Print entire ArrayList

        // Accessing elements in the ArrayList
        System.out.println("Element at index 2: " + arr1.get(2)); // Accessing element at index 2

        // Size of the ArrayList
        System.out.println("ArrayList size: " + arr1.size()); // Size of the ArrayList

        // Removing an element from the ArrayList
        int indexToRemove = 2; 
        arr1.remove(indexToRemove); // Removing an element by index
        System.out.println("ArrayList after removing index" + indexToRemove + ": " + arr1); // Print after removal

        // Removing an element by value
        Integer valueToRemove = 4;
        arr1.remove(valueToRemove); // Removing an element by value
        System.out.println("ArrayList after removing value " + valueToRemove + ": " + arr1); // Print after removal
        // or,
        int valueToRemove2 = 5;
        arr1.remove(Integer.valueOf(valueToRemove2)); // Removing an element by value
        System.out.println("ArrayList after removing value " + valueToRemove2 + ": " + arr1); // Print after removal

        // updating a value in the ArrayList
        arr1.set(1, Integer.valueOf(10)); // Setting a new value at index 2
        System.out.println("ArrayList after updating index 1: " + arr1); // Print after update

        // Sorting the ArrayList
        ArrayList <Integer> arr2 = new ArrayList<Integer>(); // Corrected initialization
        arr2.add(3);
        arr2.add(5);
        arr2.add(1);
        arr2.add(4);
        arr2.add(2);

        System.out.println("ArrayList 2: " + arr2); // Print unsorted ArrayList
        arr2.sort(Comparator.naturalOrder()); // Sorting the ArrayList
        System.out.println("Sorted ArrayList 2: " + arr2); // Sorted ArrayList
        arr2.sort(Comparator.reverseOrder()); // Sorting the ArrayList in reverse order
        System.out.println("Sorted ArrayList 2 in reverse order: " + arr2); // Sorted ArrayList in reverse order

        // contains method
        boolean containsValue = arr1.contains(10); // Checking if the ArrayList contains a value
        System.out.println("ArrayList contains 10: " + containsValue); // Print result

        // isEmpty method
        boolean isEmpty = arr1.isEmpty(); // Checking if the ArrayList is empty
        System.out.println("ArrayList is empty: " + isEmpty); // Print result

        // Searching for an element in the ArrayList
        int key = 3;
        int foundItemIndex = arr1.indexOf(key); // Searching for an element
        System.out.println("Found " + key + " at index: " + foundItemIndex); // Found index


        // for-each loop to iterate through the ArrayList
        arr2.forEach(val -> System.out.print(val*val + " ")); // Print each element squared

        // concatenating two ArrayLists
        ArrayList<Integer> arr3 = new ArrayList<>(arr1); // Creating a new ArrayList with elements of arr1
        arr3.addAll(arr2); // Adding all elements of arr2 to arr3
        System.out.println("\nConcatenated ArrayList: " + arr3); // Print concatenated ArrayList
    }
}
