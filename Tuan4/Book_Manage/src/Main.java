import model.Book;
import service.BookService;
import exception.BookNotFoundException;
import exception.DuplicateBookException;

public class Main {

    public static void main(String[] args) {

        BookService service = new BookService();

        try {
            service.addBook(new Book("B01", "Java Core", "Cuong"));
            service.addBook(new Book("B02", "Spring Boot", "Cuong"));

            // Thêm trùng ID
            service.addBook(new Book("B01", "Duplicate Book", "Test"));

        } catch (DuplicateBookException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            service.removeBookById("B99");
        } catch (BookNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\n=== ALL BOOKS ===");
        service.getAllBooks().forEach(System.out::println);
    }
}