public class AccountService {
    private double balance = 1_000_000;
    public void validateAmount(double amount){
        if(amount <= 0){
            throw new InvalidAmountException("Amount > 0", "Invalid_Error");
        }
        if(amount > balance){
            throw new InvalidAmountException("Amount < Balance", "Invalid_Error");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công.");
        System.out.println("Số dư còn lại: " + balance);


    }
}
