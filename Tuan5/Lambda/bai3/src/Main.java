import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> ds = x -> x * x;

        System.out.println(ds.apply(5));

    }
}