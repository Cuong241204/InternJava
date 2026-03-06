import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        List<Integer> a = list.stream().map(x -> x*x).filter(x-> x >10).collect(Collectors.toList());
        System.out.println(a);

    }
}