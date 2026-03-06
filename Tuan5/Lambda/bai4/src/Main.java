import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> ds =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        ds.stream()
                .filter(x -> x % 2 ==0)
                .forEach(System.out::println);

    }
}