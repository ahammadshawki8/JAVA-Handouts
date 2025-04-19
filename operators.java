public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        int c = 10, d = 6;
        System.out.println("Division: " + (c / d)); // 1
        double e = d;
        System.out.println("Division: " + (c / e)); // 1.6666666666666667

        c += 10;
        System.out.println("c += 10: " + c); // 20
        c -= 5;
        System.out.println("c -= 5: " + c); // 15
        c++;
        System.out.println("c++: " + c); // 16
        c--;
        System.out.println("c--: " + c); // 15
        ++c;
        System.out.println("++c: " + c); // 16

        
        // Relational Operators
        System.out.println("Is a > b? " + (a > b)); // true
        System.out.println("Is a < b? " + (a < b)); // false
        System.out.println("Is a == b? " + (a == b)); // false
        System.out.println("Is a != b? " + (a != b)); // true

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Bitwise Operators
        int p = 5, q = 3; // Binary: p=0101, q=0011
        System.out.println("Bitwise AND: " + (p & q)); // 1 (0001)
        System.out.println("Bitwise OR: " + (p | q)); // 7 (0111)
        System.out.println("Bitwise XOR: " + (p ^ q)); // 6 (0110)
    }
    
}
