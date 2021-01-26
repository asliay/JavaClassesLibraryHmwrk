import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp(){
        book = new Book("The Fifth Season", "N.K. Jemisin", "Science Fantasy");
    }

    @Test
    public void hasName() {
        assertEquals("The Fifth Season", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("N.K. Jemisin", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Science Fantasy", book.getGenre());
    }
}
