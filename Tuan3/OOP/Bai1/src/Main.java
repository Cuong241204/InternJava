import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> ds = new ArrayList<>();
        ds.add(new FullTimeEmployee(1, "Cuong", 5500, 1500));
        ds.add(new PartTimeEmployee(2, "Anh", 4, 1000 ));
        for(Employee e : ds){
            System.out.println(e);
        }

    }
}