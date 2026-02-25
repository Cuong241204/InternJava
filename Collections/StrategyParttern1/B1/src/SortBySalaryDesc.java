import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBySalaryDesc implements SortStrategy {
    @Override
    public void sort(ArrayList<Employee> ds) {
        Collections.sort(ds, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.calculateSalary(), o1.calculateSalary());
            }
        });
    }
}
