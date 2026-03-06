import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Integer> ds = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> ads = ds.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.println(ads);

    }
}