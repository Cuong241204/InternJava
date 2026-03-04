package service;
import model.Account;
import java.util.List;
import java.util.ArrayList;
import exception.DuplicateAccountException;

public class AccountService {
    private List<Account> ds;
    public AccountService(){
         ds = new ArrayList<>();
    }
    public void addAccount(Account a){
        if(a == null){
            throw new IllegalArgumentException("Not null");
        }
        for(Account u : ds){
            if(u.getId().equals(a.getId())){
                throw new DuplicateAccountException("id đã tồn tại." +a.getId());
            }
        }
        ds.add(a);
        System.out.println("Thêm thành công.");
    }
    public List<Account> getAllAccounts() {
        return ds;
    }



}
