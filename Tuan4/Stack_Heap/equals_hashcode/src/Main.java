import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<User> users = new HashSet<>();

        users.add(new User("a@gmail.com"));
        users.add(new User("a@gmail.com"));
        for(User u : users){
            System.out.println(u);
        }

        System.out.println(users.size());
    }
}