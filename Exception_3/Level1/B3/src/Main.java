import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {

    public static void readFile(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        System.out.println("Mở file thành công");
    }

    public static void main(String[] args) {

        try {
            readFile("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: File không tồn tại");
        }
    }
}