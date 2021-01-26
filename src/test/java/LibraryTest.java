import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    // Write a method to count the number of books in the library.
    // Write a method to add a book to the library stock.
    // Add a capacity to the library and write a method to check if stock is full before adding a book.

    private Library leithLibrary;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void setUp() {
        leithLibrary = new Library(4);
        book1 = new Book("The Book Thief", "Markus Zusak", "General Fiction");
        book2 = new Book("The Fifth Season", "N.K. Jemisin", "Science Fantasy");
        book3 = new Book("Assassin's Apprentice", "Robin Hobb", "Fantasy");
        book4 = new Book("The Name of the Wind", "Patrick Rothfuss", "Fantasy");
        book5 = new Book("Saga", "Brian K. Vaughan/ Fiona Staples", "Graphic Novel");
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, leithLibrary.stockCount());
    }

    @Test
    public void canAddBookToStockIfSpace() {
        leithLibrary.addBook(book1);
        assertEquals(1, leithLibrary.stockCount());
    }

    @Test
    public void cantAddBookWhenStockFull() {
        leithLibrary.addBook(book1);
        leithLibrary.addBook(book2);
        leithLibrary.addBook(book3);
        leithLibrary.addBook(book4);
        leithLibrary.addBook(book5);
        assertEquals(4, leithLibrary.stockCount());
    }

    @Test
    public void canRemoveBookFromStock() {
        leithLibrary.addBook(book2);
        leithLibrary.addBook(book3);
        leithLibrary.removeBook(book2);
        assertEquals(1, leithLibrary.stockCount());
    }
}
