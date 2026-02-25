import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> ds = new HashMap<>();
        ds.put("Java", 10);
        ds.put("Python", 8);
        ds.put("C++", 7);
        System.out.println(ds.get("Java"));
        if(!ds.containsKey("Go")){
            ds.put("Go", 9);
        }
        System.out.println(ds);


    }
}