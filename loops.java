public class loops {
    public static void main(String[] args) {
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }
        
        // iterating over an array using a for loop
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println("Enhanced for loop element: " + num);
        }

        // While loop
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);

    }
    
}
