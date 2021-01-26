import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;


    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }


    public int stockCount() {
        return books.size();
    }

    public void addBook(Book book) {
        if(this.books.size() < this.capacity) {
            this.books.add(book);
        }
    }
}
