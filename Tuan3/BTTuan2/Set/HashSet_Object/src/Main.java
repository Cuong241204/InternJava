import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<User> set = new HashSet<>();
        User u1 = new User(1, "Cuong");
        User u2 = new User(1, "Cuong");
        set.add(u1);
        set.add(u2);
        System.out.println(set);
        System.out.println(set.size());



    }
}