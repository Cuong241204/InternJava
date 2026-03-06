import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        int findMax = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(findMax);

    }
}