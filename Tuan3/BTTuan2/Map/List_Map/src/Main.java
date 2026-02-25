import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        ds.add("cuong");
        ds.add("cuong");
        ds.add("admin");
        ds.add("guest");
        ds.add("cuong");
        ds.add("admin");
        HashMap<String, Integer> cntLogin = new HashMap<>();
        for(String x : ds){
            if(cntLogin.containsKey(x)){
                cntLogin.put(x, cntLogin.get(x) + 1);
            }
            else {
                cntLogin.put(x, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : cntLogin.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        String maxUser = "";
        int maxCount = 0;

        for(Map.Entry<String, Integer> entry : cntLogin.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxUser = entry.getKey();
            }
        }

        System.out.println("User login nhieu nhat: " + maxUser + " (" + maxCount + " lan)");


    }
}