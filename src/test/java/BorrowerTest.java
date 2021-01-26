import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library leithLibrary;
    private Borrower meredith;
    private Book book;

    @Before
    public void setUp() {
        meredith = new Borrower();
        book = new Book("Saga", "Brian K. Vaughan/ Fiona Staples", "Graphic Novel");
        leithLibrary = new Library(5);
        leithLibrary.addBook(book);
    }

    @Test
    public void bookshelfStartsEmpty() {
        assertEquals(0, meredith.bookshelfCount());
    }

    @Test
    public void canBorrowBook() {
        assertEquals(0, meredith.bookshelfCount());
        assertEquals(1, leithLibrary.stockCount());
        meredith.borrowBook(leithLibrary, book);
        assertEquals(1, meredith.bookshelfCount());
        assertEquals(0, leithLibrary.stockCount());
    }
}
