public class Invoice {
    int id;
    double amount;
    Customer customer;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    int getCustomerId(){
        return customer.getId();
    }
    String getCustomerName(){
        return customer.getName();
    }
    int getCustomerDiscount(){
        return customer.getDiscount();
    }
    double getAmountAfterDiscount(){
        return amount - ((amount/100)*customer.discount);
    }
    @Override
    public String toString(){
        return "Invoice[id="+id+",customer="+customer+",amount="+amount+"]";
    }
}
