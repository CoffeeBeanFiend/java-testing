import java.math.BigInteger;

public class Book {
    protected String title, author;
    protected BigInteger price;

    public Book(String title, String author, BigInteger price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BigInteger getPrice() {
        return price;
    }

    public Book setPrice(BigInteger price) {
        this.price = price;
        return this;
    }
}
