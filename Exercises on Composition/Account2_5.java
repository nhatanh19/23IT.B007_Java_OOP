public class Account2_5 {
    int id;
    Customer2_5 customer;
    double balance = 0.0;

    public Account2_5(int id, Customer2_5 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account2_5(int id, Customer2_5 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer2_5 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString(){
        return customer.toString() + " balance=$"+ balance;
    }
    String getCustomerName(){
        return customer.getName();
    }
    Account2_5 deposit(double amount){
        this.balance += amount;
        return this;
    }
    Account2_5 withdraw(double amount){
        if(balance >= amount){
           this.balance -= amount;
        } else System.out.println("Amount withdraw exceeds the current balance!");
        return this;
    }
}
