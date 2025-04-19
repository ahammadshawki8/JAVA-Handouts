// This is the declaration of a public class named 'test'.
// In Java, the class name must match the file name (case-sensitive).
public class helloworld {
    static int salary = 1000; // This is a static variable 'salary' initialized to 1000.
    // difference between static and class variables:
    // Static variables are shared among all instances of the class, while class variables are specific to each instance.

    // This is the main method, the entry point of any Java application.
    // When you run the program, the Java Virtual Machine (JVM) starts executing code from here.
    public static void main(String[] args) {

        // This line prints "Hello, World!" to the console.
        // 'System.out.println' is used to display output in Java.
        System.out.println("Hello, World!");

        int age;
        age = 20;
        System.out.println("My age is " + age + " years old."); 
        System.out.println("My salary is " + salary + " dollars."); // This prints the value of the static variable 'salary'.


    }
}