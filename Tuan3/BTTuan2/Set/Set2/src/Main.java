import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        ds.add("A");
        ds.add("B");
        ds.add("A");
        ds.add("C");
        ds.add("D");
        ds.add("B");
        System.out.println(ds);
//        HashSet<String> set = new HashSet(ds);
//        System.out.println(set);
        LinkedHashSet<String> set = new LinkedHashSet<>(ds);
        System.out.println(set);
        //LinkedHashSet đảm bảo thứ tự ban đầu.

    }
}