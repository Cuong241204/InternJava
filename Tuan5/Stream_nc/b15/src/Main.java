import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> ds = Arrays.asList("cat","dog","apple","banana");

        Map<Integer, List<String>> ads = ds.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(ads);

    }
}