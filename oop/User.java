package oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String password;
    private ArrayList<Book> books = new ArrayList<Book>();

    public User(String name, String dateOfBirth, String email, String password, ArrayList<Book> books) {
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.email = email;
        this.password = password;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return dateOfBirth.format(formatter);
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int age() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(dateOfBirth, today);
        return period.getYears();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

}
