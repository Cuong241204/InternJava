import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cần thanh toán");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.println("\n===== CHỌN PHƯƠNG THỨC THANH TOÁN =====");
        System.out.println("1. Tiền mặt");
        System.out.println("2. Thẻ");
        System.out.println("3. Momo");
        System.out.print("Chọn: ");
        int choice = sc.nextInt();

        PaymMethod method = null;
        switch(choice){
            case 1:
                method = new CashPayment();
                break;
            case 2:
                method = new CardPayment();
                break;
            case 3:
                method = new MomoPayment();
                break;
            default:
                System.out.println("Không có lựa chọn hợp lệ");
                return;
        }
        method.pay(amount);
        sc.close();

    }
}