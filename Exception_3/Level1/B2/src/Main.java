import java.util.Scanner;
public class Main {
    public static void ValidateAge(int age){
        if(age <0){
            throw new IllegalArgumentException("tuổi không được nhỏ hơn 0");
        }
        if(age > 120){
            throw new IllegalArgumentException("tuổi không hợp lệ");
        }
        System.out.println("Tuổi hợp lệ");

    }
    public static void main(String[] args) {
        try{
            ValidateAge(10);
            ValidateAge(-1);
        } catch(IllegalArgumentException e){
            System.out.println("Lỗi "+e.getMessage());

        }

    }
}