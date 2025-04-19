// Import the Scanner class
import java.util.Scanner;

// Scanner class
// The Scanner class is used to read input from various sources, including keyboard input, files, and network connections.
// It provides methods to read different types of data, such as strings, integers, and floating-point numbers.
// The Scanner class is part of the java.util package.


public class inputs {
    public static void main(String[] args) {


        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read a string

        System.out.print("Enter a string: "); // print method is used to print the message without a new line
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);
        System.out.printf("You entered: %s\n", str); // printf method is used to print the formatted string without using String.format method

        // Read an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // Again read a string after reading an integer
        // This is necessary because the nextInt() method does not consume the newline character left in the buffer.
        // To fix this, we can add an extra scanner.nextLine() after reading the integer.
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter another string: ");
        String str2 = scanner.nextLine();
        System.out.println("You entered: " + str2);

        
        // Read a double
        System.out.print("Enter a double: ");
        double dnum = scanner.nextDouble();
        System.out.println("You entered: " + dnum);
        
        scanner.nextLine(); 

        // Another trick we can use is that we can always use scanner.nextLine() and after that we can convert the string to the required type using the appropriate method.
        // For example, we can read a double as a string and then convert it to double using Double.parseDouble() method.
        System.out.print("Enter a double as a string: ");
        String dnumStr = scanner.nextLine();
        double dnum2 = Double.parseDouble(dnumStr); // Convert string to double
        System.out.println("You entered: " + dnum2);


        // Close the scanner
        scanner.close();
    }
    
}
