// creating a basic calculator using switch statements.
// it will take two numbers and an operator as input and perform the operation based on the operator.

import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine(); 

        // Read an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        double result; // variable to store the result

        // Perform the operation based on the operator
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (num2 != 0) { // check for division by zero
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        // Close the scanner
        scanner.close();
    }
}
