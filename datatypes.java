public class datatypes {
    public static void main(String[] args) {
        // This is a single-line comment in Java.
        // It is used to explain the code or to make notes.

        // Declaring and initializing variables of different primitive data types
        byte ageInYears = 25; // Byte data type (8 bits)
        short yearOfBirth = 1998; // Short data type (16 bits)
        int age = 20; // Integer data type (32 bits)
        long distanceToMoon = 384400000L; // Long data type (64 bits, 'L' suffix indicates long)


        float height = 5.9f; // Float data type (32 bits, 'f' suffix indicates float)
        double salary = 1000.50; // Double data type (64 bits)


        char grade = 'A'; // Character data type (16 bits)
        boolean isEmployed = true; // Boolean data type (1 bit, can be true or false)

        // Printing the values of the variables
        System.out.println("My age is " + age + " years old.");
        System.out.println("My salary is " + salary + " dollars.");
        System.out.println("My grade is " + grade + ".");
        System.out.println("Am I employed? " + isEmployed);
        System.out.println("I was born in the year " + yearOfBirth + ".");
        System.out.println("My height is " + height + " feet.");
        System.out.println("The distance to the moon is " + distanceToMoon + " meters.");
        System.out.println("My age in years is " + ageInYears + ".");

        int number1 = 5;
        double number2 = number1;
        // Implicit casting from int to double (widening conversion)
        System.out.println("Implicit casting from int to double: " + number2);

        double number3 = 5.5;
        int number4 = (int) number3;
        // Explicit casting from double to int (narrowing conversion). Implicit casting is not possible here.
        // This is because double has a larger range than int.
        // When you cast a double to an int, the decimal part is truncated.
        System.out.println("Explicit casting from double to int: " + number4);
    }
} 