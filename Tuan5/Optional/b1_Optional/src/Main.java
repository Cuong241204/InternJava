import java.util.Optional;
public class Main {
    public static int getLength(String s){
        return Optional.ofNullable(s).map(String::length).orElse(0);
    }
    public static String getLengths(String name){
        return Optional.ofNullable(name).orElse("Unknown");

    }
    public static void main(String[] args) {
        System.out.println(getLength("Cuong"));
        System.out.println(getLength(null));
        System.out.println(getLengths("Anh"));
        System.out.println(getLengths(null));


    }

}