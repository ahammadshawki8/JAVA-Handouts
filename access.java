import java.util.ArrayList;

// using packages
import oop.AudioBook;
import oop.Book;
import oop.Ebook;
import oop.User;

public class access {
    public static void main (String[] args) {
        String name = "Ahammad Shawki";
        String dateOfBirth = "2004-12-28";
        String email = "ahammadshawki8@gmail.com";
        String password = "helloworld123";

        ArrayList<Book> books = new ArrayList<Book>(); 


        User man = new User(name, dateOfBirth, email, password, books); 

        System.out.println("The email address is: " + man.getEmail());
        System.out.println("This man's age is: " + man.age());

        Book book1 = new Book("The Alchemist", "Paulo Coelho", 208);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 277);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        man.addBook(book1);
        man.addBook(book2);
        man.addBook(book3);

        System.out.println("All books man have - " + man.getBooks());
        man.removeBook(book2);
        System.out.println("All books man have - " + man.getBooks());

        AudioBook book4 = new AudioBook("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 36000);
        Ebook book5 = new Ebook("Carry on Jeeves", "P.G. Wodehouse", 280, "PDF");

        man.addBook(book4);
        man.addBook(book5);
        System.out.println("All books man have - " + man.getBooks());

    }
}
