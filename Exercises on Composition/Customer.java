public class Customer {
    int id, discount;
    String name;

    public Customer(int id, String name ,int discount) {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    @Override
    public String toString(){
        return name+"("+id+")("+discount+"%)";
    }
}
