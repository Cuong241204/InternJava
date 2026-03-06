import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> ds = Arrays.asList("apple","banana","apple","orange","banana");
        Map<String , Long> ads = ds.stream().collect(Collectors.groupingBy(x->x, Collectors.counting()));

        System.out.println(ads);

    }
}