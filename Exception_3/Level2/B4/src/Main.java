import exception.InsufficientBalanceException;
public class Main {

    public static void main(String[] args) {

        Account account = new Account("ACC01", 1000);

        try {
            account.deposit(500);      // ✔ hợp lệ
            account.withdraw(2000);    // ❌ thiếu tiền
            account.withdraw(-5);      // ❌ số âm
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi nhập liệu: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Lỗi nghiệp vụ: " + e.getMessage());
        }

        System.out.println("Số dư cuối: " + account.getBalance());
    }
}