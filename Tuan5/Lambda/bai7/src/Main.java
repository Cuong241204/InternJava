//Viết hàm getLength(String s)
//Nếu s = null → trả về 0
//Sử dụng Optional
import java.util.Optional;

public class Main {
    public static int getLength(String s) {
        return Optional.ofNullable(s)
                .map(String::length)
                .orElse(0);
    }
    public static void main(String[] args) {
        System.out.println(getLength("Cuong"));
        System.out.println(getLength(null));

    }
}