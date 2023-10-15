import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {
    String name, data;
    Author[] authors;
    double price;
    int qty = 0;


    Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price=price;
    }
    Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors= authors;
        this.price=price;
        this.qty = qty;
    }

    String getName(){
        return name;
    }
    Author[] getAuthor(){
        return authors;
    }
    Double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price = price;
    }
    int getQty(){
        return qty;
    }

    String getAuthorNames(){
        return authors[0].getName()+","+authors[1].getName();
    }
    void setQty(int qty){
        this.qty = qty;
    }

    @Override
    public String toString(){
       return "Book[name="+name+",name=" + Arrays.toString(authors) +"price="+price+",qty="+qty+"]";

    }
}
