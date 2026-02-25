import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountService a = new AccountService();

        try{
            System.out.print("Nhập số tiền cần rút: ");
            double amount = sc.nextDouble();

            a.validateAmount(amount);
        } catch(InvalidAmountException e){
            System.out.println("Lỗi ! " + e.getMessage());
            System.out.println("Error | " + e.getError());
        } finally{
            sc.close();
            System.out.println("End.");
        }

    }
}