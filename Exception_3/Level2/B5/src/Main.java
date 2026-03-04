import exception.DuplicateAccountException;
import model.Account;
import service.AccountService;
public class Main {
    public static void main(String[] args) {
        AccountService acc = new AccountService();
        try {
            Account a1 = new Account("01A", 1000);
            Account a2 = new Account("01A", 2000);
            acc.addAccount(a1);
            acc.addAccount(a2);

        } catch(DuplicateAccountException e){
            System.out.println("Lỗi " + e.getMessage());
        }

    }
}