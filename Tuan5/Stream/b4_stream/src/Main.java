import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","spring","docker","aws","java");
        List<String> ads= list.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
        System.out.println(ads);

    }
}