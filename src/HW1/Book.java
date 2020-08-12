package HW1;

public class Book {
    int id = 0;
    String title;
    double price = 0.0;
    String author;
    double rate;

    public Book() {
    }

    public Book(int id, String title, double price, String author, double rate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", rate=" + rate +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
