package repository;
import java.util.*;

import model.Book;

public class BookRepository implements Repository<Book> {

    private Set<Book> ds = new HashSet<>();

    @Override
    public void add(Book b) {
        ds.add(b);
    }

    @Override
    public void remove(Book b) {
        ds.remove(b);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(ds); // không lộ Set nội bộ
    }

    public boolean existsById(String id) {
        return ds.stream().anyMatch(b -> Objects.equals(b.getId(), id));
    }

    public Book findById(String id) {
        return ds.stream()
                .filter(b -> Objects.equals(b.getId(), id))
                .findFirst()
                .orElse(null);
    }


}
