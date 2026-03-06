import java.util.function.BiFunction;
public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> ds = (a, b) -> a + b;

        int a = 3;
        int b = 7;
        int result = ds.apply(a, b);
        System.out.println(result);


    }
}