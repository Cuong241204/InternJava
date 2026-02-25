import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgeService a = new AgeService();

        try{
            System.out.print("Nhập tuổi: ");
            int age = sc.nextInt();
            a.validateAge(age);
            System.out.println("Đăng ký thành công!");
        } catch(InvalidAgeException e){
            System.out.println("Error code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        } finally{
            sc.close();
            System.out.println("End.");
        }

    }
}