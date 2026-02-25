import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        ds.add("Java");
        ds.add("Python");
        ds.add("C++");
        ds.add("Go");
        ds.add("JavaScript");
        int rsIndex = ds.indexOf("Go");
        if(rsIndex != -1){
            ds.set(rsIndex, "GoLang");
        }
        if(!ds.contains("PHP")){
            ds.add("PHP");
        }
        System.out.println(ds);



    }
}