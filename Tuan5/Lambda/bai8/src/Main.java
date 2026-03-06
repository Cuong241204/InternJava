import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> ds = Arrays.asList("Java","Python","C","JavaScript");

        List<String> ads = ds.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
        System.out.println(ads);

    }
}