import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> ds = new ArrayList<>();
        ds.add(new Student(1, "Anh", 3.5));
        ds.add(new Teacher(2, "Cuong", 10000));
        for(Person p : ds){
            System.out.println(p);
        }

    }
}