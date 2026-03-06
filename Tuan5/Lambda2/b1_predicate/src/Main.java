import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> ktra = n -> n % 3 == 0;

        System.out.println(ktra.test(9));


    }
}