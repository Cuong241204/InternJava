
public class Main {
    public static void main(String[] args) {
        Box<String> stringRepo = new Box<>();
        stringRepo.add("Anh");
        stringRepo.add("Cuong");

        System.out.println(stringRepo.findAll());

        Box<Integer> IntRepo = new Box<>();
        IntRepo.add(1);
        IntRepo.add(100);

        System.out.println(IntRepo.findAll());


    }
}