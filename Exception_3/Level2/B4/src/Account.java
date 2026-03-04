import exception.InsufficientBalanceException;

public class Account {
    private String id;
    private double balance;
    public Account(String id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount <=0){
            throw new IllegalArgumentException("amount >0");
        }
        balance += amount;
        System.out.println("Nạp thành công. Số dư hiện tại: " + balance);
    }
    public void withdraw(double amount){
        if(amount <=0){
            throw new IllegalArgumentException("amount >0");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("amount <=balance ");
        }
        balance -= amount;
        System.out.println("Rút thành công. Số dư hiện tại: " + balance);
    }
    public double getBalance() {
        return balance;
    }

}
