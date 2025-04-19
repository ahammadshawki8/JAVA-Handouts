package oop;

public class AudioBook extends Book {
    private int runtime; 

    public AudioBook(String title, String author, int runtime) {
        super(title, author, 0); // Call the constructor of the superclass (Book)
        this.runtime = runtime; // Initialize the runtime variable
    }
    
    public int getRuntime() {
        return runtime; // Getter for runtime
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime; // Setter for runtime
    }
}
