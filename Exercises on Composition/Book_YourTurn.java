
public class Book_YourTurn {
    String isbn, name;
    Author_YourTurn author;
    double price;
    int qty = 0;

    public Book_YourTurn(String isbn, String name, Author_YourTurn author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book_YourTurn(String isbn, String name, Author_YourTurn author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author_YourTurn getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    String getAuthorName(){
        return author.getName();
    }

    @Override
    public String toString() {
        return "Book_YourTurn[" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                "," + author +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
}

class Author_YourTurn{
    String name, email;

    public Author_YourTurn(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author_YourTurn[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ']';
    }
}