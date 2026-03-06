import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Integer> ds = Arrays.asList(5, 2, 8, 1, 3);
        List<Integer> ads = ds.stream().sorted().limit(3).collect(Collectors.toList());

        System.out.println(ads);

    }
}