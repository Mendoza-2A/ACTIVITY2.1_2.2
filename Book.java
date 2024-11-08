public class Book {
    private int book_number;
    private String title;
    private String author;
    private double price;

    // Setter for book_number
    public void setBook_Number(int number) {
        this.book_number = number;
    }

    // Getter for book_number
    public int getBook_Number() {
        return book_number;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}