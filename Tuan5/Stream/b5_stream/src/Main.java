import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> ds = Arrays.asList("java","spring","docker","aws","java");
        long cnt = ds.stream().count();
        System.out.println(cnt);
        List<String> ads = ds.stream().distinct().collect(Collectors.toList());
        System.out.println(ads);


    }
}