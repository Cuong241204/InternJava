package repository;

import model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRepository implements Repository<User> {

    private Set<User> ds = new HashSet<>();

    @Override
    public void add(User user) {
        ds.add(user);
    }

    @Override
    public void remove(User user) {
        ds.remove(user);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(ds);
    }

    public User findByUsername(String username) {
        for (User u : ds) {
            if (u.getUserName().equals(username)) {
                return u;
            }
        }
        return null;
    }
}