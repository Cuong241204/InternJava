import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();

        User u1 = new User("a@gmail.com");
        users.add(u1);

        System.out.println(users.remove(new User("a@gmail.com")));
        User u2 = new User("a@gmail.com");
        users.add(u2);
        System.out.println(users.size());
    }
}