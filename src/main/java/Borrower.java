import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookshelf;

    public Borrower() {
        this.bookshelf = new ArrayList<Book>();
    }

    public int bookshelfCount() {
        return this.bookshelf.size();
    }

    public void borrowBook(Library library, Book book) {
        Book borrowedBook = library.removeBook(book);
        this.bookshelf.add(borrowedBook);
    }
}
