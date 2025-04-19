package oop;

public class Ebook extends Book {
    private String format; 

    public Ebook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount); // Call the constructor of the superclass (Book)
        this.format = format; // Initialize the format variable
    }
    
    public String getformat() {
        return format; // Getter for format
    }

    public void setformat(String format) {
        this.format = format; // Setter for format
    }
}
