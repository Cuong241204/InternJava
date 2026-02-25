import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhập số thứ 1: ");
            int a = sc.nextInt();
            System.out.print("Nhập số thứ 2: ");
            int b = sc.nextInt();
            double result = a/b;
            System.out.println("Kết quả: " + result);

        } catch(ArithmeticException e){
            System.out.println("Không thể chia cho 0");
        } catch(Exception e){
            System.out.println("Lỗi ko xác định" + e.getMessage());
        } finally{
            System.out.println("Kết thúc chương trình.");
        }


    }
}