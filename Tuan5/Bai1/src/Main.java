import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== 1. In từng số ===");
        numbers.forEach(n -> System.out.println(n));

        System.out.println("\n=== 2. In bình phương từng số ===");
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.println(n));

        System.out.println("\n=== 3. In các số chẵn ===");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        System.out.println("\n=== 4. Kiểm tra lazy của Stream ===");

        numbers.stream()
                .map(n -> {
                    System.out.println("Processing: " + n);
                    return n * n;
                });

        System.out.println("Đoạn trên không in gì vì chưa có terminal operation");

        System.out.println("\n=== 5. Thêm terminal operation ===");

        numbers.stream()
                .map(n -> {
                    System.out.println("Số: " + n);
                    return n * n;
                })
                .forEach(n -> System.out.println("Kết quả: " + n));
    }
}