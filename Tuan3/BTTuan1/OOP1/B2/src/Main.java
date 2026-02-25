import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> ds = new ArrayList<>();
        ds.add(new FullTimeEmployee(1, "Do Cuong", 10000, 2500));
        ds.add(new PartTimeEmployee(2, "Anh", 6, 500));
        for(Employee e : ds){
            System.out.println(e);
        }




    }
}