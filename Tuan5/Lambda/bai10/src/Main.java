//đếm số lần xuất hiện
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple","banana","apple","orange");

        Map<String, Long> result = list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(result);
    }
}

