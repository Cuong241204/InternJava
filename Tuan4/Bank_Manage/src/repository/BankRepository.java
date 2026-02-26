package repository;

import model.BankAccount;
import java.util.*;

public class BankRepository implements Repository<BankAccount> {
    private Set<BankAccount> ds = new HashSet<>();
    public void add(BankAccount a){
        this.ds.add(a);
    }
    public void remove(BankAccount a){
        this.ds.remove(a);
    }
    public List<BankAccount> findAll(){
        return new ArrayList<>(ds);
    }
    public BankAccount findByAccountNum(String accNum){
        for(BankAccount a : ds){
            if(accNum != null && accNum.equals(a.getAccountNum())){
                return a;
            }
        }
        return null;
    }



}
