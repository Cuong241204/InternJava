package model;
import java.util.Objects;
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    public BankAccount(String num, String name, double balance){
        this.accountNumber = num;
        this.ownerName = name;
        this.balance = balance;
    }
    public String getAccountNum(){
        return accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        BankAccount a = (BankAccount) o;
        return this.accountNumber == a.accountNumber;

    }
    @Override
    public int hashCode(){
        return Objects.hash(accountNumber);
    }
    @Override
    public String toString(){
        return accountNumber + " - " + ownerName + " - " + balance;
    }




}
