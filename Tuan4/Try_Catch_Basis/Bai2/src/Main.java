import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Nhập tuổi: ");
                age = sc.nextInt();

                if (age <= 0) {
                    System.out.println("Tuổi phải > 0");
                    continue;
                }

                valid = true;

            } catch (InputMismatchException e) {
                System.out.println("❌ Không được nhập chữ!");
                sc.nextLine(); // Xóa dữ liệu sai
            }
        }

        System.out.println("Tuổi hợp lệ: " + age);
        sc.close();
        System.out.println("Chương trình kết thúc.");
    }
}