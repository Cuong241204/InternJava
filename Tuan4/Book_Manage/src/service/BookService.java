package service;

import model.Book;
import repository.BookRepository;
import exception.BookNotFoundException;
import exception.DuplicateBookException;

import java.util.List;

public class BookService {

    private BookRepository repository = new BookRepository();

    public void addBook(Book book) {
        if (repository.existsById(book.getId())) {
            throw new DuplicateBookException("Book ID already exists: " + book.getId());
        }
        repository.add(book);
    }

    public void removeBookById(String id) {
        Book book = repository.findById(id);
        if (book == null) {
            throw new BookNotFoundException("Book not found: " + id);
        }
        repository.remove(book);
    }

    public Book findBookById(String id) {
        Book book = repository.findById(id);
        if (book == null) {
            throw new BookNotFoundException("Book not found: " + id);
        }
        return book;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }
}