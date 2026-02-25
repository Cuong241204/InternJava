import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByNameAsc implements SortStrategy {
    @Override
    public void sort(ArrayList<Employee> list) {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }
}
