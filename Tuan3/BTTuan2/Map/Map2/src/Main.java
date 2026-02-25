import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        ds.add("a");
        ds.add("b");
        ds.add("c");
        ds.add("a");
        ds.add("c");
        ds.add("a");
        System.out.println(ds);
        HashMap<String, Integer> map = new HashMap<>();
        for(String x : ds){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }
            else {
                map.put(x, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }



    }
}