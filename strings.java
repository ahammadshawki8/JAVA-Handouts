public class strings {
    public static void main(String[] args) {
        // String declaration and initialization
        String str1 = "Hello, World!"; // String literal
        String str2 = new String("Hello, World!"); // String object
        // difference between string literal and string object:
        // String literals are stored in the string pool, while string objects are stored in the heap memory.
        // String literals are more memory efficient and faster to access than string objects.
        // String literals are immutable, meaning they cannot be changed after creation.
        // String objects can be mutable or immutable, depending on how they are created.
  

        String copystr1 = "Hello, World!";
        String copystr2 = new String("Hello World!");
        System.out.println(str1 == copystr1);
        System.out.println(str2 == copystr2);
        // here str1 and copystr1 are string literals, so they are stored in the string pool, and they point to the same memory location.
        // str2 and copystr2 are string objects, so they are stored in the heap memory, and they point to different memory locations.

        // String length
        System.out.println("Length of str1: " + str1.length()); // 13

        // is empty
        System.out.println("Is str1 empty? " + str1.isEmpty()); // false

        // String concatenation
        String str3 = str1 + " How are you?"; // Using + operator
        System.out.println("Concatenated string: " + str3); // Hello, World! How are you?

        // String formatting
        String name = "John";
        String city = "New York";
        int age = 30;
        String company = "Google";
        double salary = 100000.50;
        boolean honest = true;
        
        String formattedString = String.format("My name is %s, I am %d years old, I live in %s, and I work at %s. My salary is %f. I am telling the %b.", name, age, city, company, salary, honest);
        System.out.println("Formatted string: " + formattedString);

        // String manipulation
        String str4 = "  Hello, World!  "; // String with leading and trailing spaces
        System.out.println("Trimmed string: " + str4.trim()); // Hello, World!

        System.out.println("Uppercase: " + str4.toUpperCase()); // HELLO, WORLD!
        System.out.println("Lowercase: " + str4.toLowerCase()); // hello, world!

        str4 = str4.trim();

        System.out.println("Replace 'World' with 'Java': " + str4.replace("World", "Java")); // Hello, Java!
        System.out.println("Index of 'World': " + str4.indexOf("World")); // 7
        System.out.println("Last index of 'o': " + str4.lastIndexOf("o")); // 8
        System.out.println("Starts with 'Hello': " + str4.startsWith("Hello")); // true
        System.out.println("Ends with '!': " + str4.endsWith("!")); // true
        System.out.println("Contains 'World': " + str4.contains("World")); // true
        
        // String split
        // The split() method splits a string into an array of substrings based on a specified delimiter.

        System.out.println("Split str1 by space: ");
        String[] words = str1.split(" "); // creating an array of strings by splitting str1 by space. we can use regex inside the split method.
        for (String word : words) { // for loop to iterate through the array of strings.
            System.out.println(word); // Hello, World!
        }



        // String comparison
        System.out.println("Are str1 and str2 equal? " + str1.equals(str2)); // true
        String str5 = "HELLO, WORLD!";
        System.out.println("Are str1 and str5 equal ignoring case? " + str1.equalsIgnoreCase(str5)); // true

        // Substring
        System.out.println("Substring of str1: " + str1.substring(7, 12)); // World

        // Character at a specific index
        System.out.println("Character at index 7 in str1: " + str1.charAt(7)); // W

        // String to character array
        char[] charArray = str1.toCharArray();
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " "); // H e l l o ,   W o r l d ! 
        }
    }
}
