import java.math.BigInteger;
import java.util.ArrayList;

public class Cart {
    protected ArrayList<Book> books = new ArrayList<>();

    public Cart addBook(Book book) {
        books.add(book);
        return this;
    }

    public Cart clear() {
        books = new ArrayList<>();
        return this;
    }

    public BigInteger sumOfPrices() {
        BigInteger sum = books.stream().map(book -> book.getPrice()).reduce(BigInteger.ZERO, (a, b) -> a.add(b));
        return sum;
    }
}
