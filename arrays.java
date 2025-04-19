import java.util.Arrays; // Importing the Arrays class for utility methods

public class arrays {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] arr1 = {1, 2, 3, 4, 5}; // Array literal
        int[] arr2 = new int[5]; // Array object with size 5
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        // Print array elements
        System.out.println("Array 1: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Array 2: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        char [] vowels = {'o', 'u', 'a', 'e', 'i'}; 
        System.out.println(Arrays.toString(vowels));  // printing entire array

        System.out.println("Array length: " + arr1.length); // Array length

        Arrays.sort(vowels); // Sorting the array
        System.out.println("Sorted Array 1: " + Arrays.toString(vowels)); // Sorted array

        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels, key);
        System.out.println("Found " + key + " at index: " + foundItemIndex); // Binary search for an element

        int startIndex = 1;
        int endIndex = 4;
        int foundItemIndex2 = Arrays.binarySearch(vowels, startIndex, endIndex, key);
        System.out.println("Found " + key + " at index: " + foundItemIndex2); // Binary search with range
        // if the item is not found, it returns a negative number

        char [] vowels2 = Arrays.copyOf(vowels, vowels.length + 5); // Copying the array with extra space/zeros

        Arrays.fill(vowels2,  startIndex, endIndex, 'x'); // Filling a range of the array with a specific value
        System.out.println("Original Array: " + Arrays.toString(vowels)); // Print original array
        System.out.println("Filled Array: " + Arrays.toString(vowels2)); // Print filled array

        char [] vowels3 = Arrays.copyOfRange(vowels, startIndex, endIndex); // Copying a range of the array
        System.out.println("Copied Array: " + Arrays.toString(vowels3)); // Print copied array

        char [] vowels4 = Arrays.copyOf(vowels, vowels.length); 
        System.out.println(Arrays.equals(vowels, vowels4)); // Check if two arrays are equal


    }
    
}
