public class Account {
    String id, name;
    int balance = 0;

    Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    String getID() {
        return id;
    }

    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }
    int credit(int amount){
        this.balance += amount;
        return balance;
    }
    int debit(int amount){
        if(amount <= balance){
            balance -= amount;
        } else System.out.println("Amount exceeded balance!");;
    return balance;
    }
    int transferTo(Account another, int amount){
        if(amount <= balance){
            balance -= amount;
            another.credit(amount);
        } else System.out.println("Amount exceeded balance!");
        return balance;
    }
    @Override
    public String toString(){
        return "Account[id="+id+",name="+name+",balance="+balance+"]";
    }

}
