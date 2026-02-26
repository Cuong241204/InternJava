import model.BankAccount;
import service.BankService;
import exception.InsufficientBalanceException;
import exception.DuplicateAccountException;

public class Main {

    public static void main(String[] args) {

        BankService service = new BankService();

        try {
            service.createAccount(new BankAccount("A01", "Nam", 1000));
            service.createAccount(new BankAccount("A01", "Nam", 2000)); // trùng

        } catch (DuplicateAccountException e) {
            System.out.println("Lỗi tạo tài khoản: " + e.getMessage());
        }

        try {
            service.withdraw("A01", 2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Lỗi rút tiền: " + e.getMessage());
        }

        service.deposit("A01", 500);

        service.showAll();
    }
}