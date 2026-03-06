import java.util.*;
import java.util.stream.Collectors;
import java.util.OptionalDouble;
public class Main {
    public static void main(String[] args) {
        List<Integer> ds = Arrays.asList(10, 20, 30, 40, 50);
        OptionalDouble avg = ds.stream().mapToInt(x -> x).average();//tbc
        List<Integer> ads = ds.stream().limit(3).collect(Collectors.toList());//lấy 3 ptu đầu
        List<Integer> bds = ds.stream().skip(2).collect(Collectors.toList());//bỏ 2 ptu đầu
        System.out.println(avg.orElse(0.0));
        System.out.println(ads);
        System.out.println(bds);

    }
}