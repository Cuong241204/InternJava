import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<User> ds = new ArrayList<>();
        ds.add(new User(1, "Cuong2412", "1234567"));
        ds.add(new User(2, "Cvhhai", "1234579"));
        for(User u : ds){
            System.out.println(u);
        }

    }
}