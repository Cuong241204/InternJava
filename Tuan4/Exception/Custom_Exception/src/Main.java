import java.util.Scanner;
public class Main {
    public static void checkAge(int age){
        if(age < 18){
            throw new InvalidAgeException("Tuổi phải >=18");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhập tuổi: ");
            int age = sc.nextInt();
            checkAge(age);
            System.out.println("Tuổi hợp lệ.");
        } catch(InvalidAgeException e){
            System.out.println("Lỗi ! " + e.getMessage());

        } catch(Exception e){
            System.out.println("Lỗi không xác định " + e.getMessage());
        } finally{
            sc.close();
            System.out.println("End");
        }



    }
}