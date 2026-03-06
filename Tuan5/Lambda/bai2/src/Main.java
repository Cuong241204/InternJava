import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Khai báo Predicate nhận vào Integer
        Predicate<Integer> ktraChan = n -> n % 2 == 0;

        // Kiểm tra
        System.out.println(ktraChan.test(4));
        System.out.println(ktraChan.test(7));
    }
}