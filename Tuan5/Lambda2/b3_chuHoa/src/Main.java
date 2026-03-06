import java.util.Locale;
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
        Function<String, String> ds = s -> s.toUpperCase();

        System.out.println(ds.apply("cuong"));

    }
}