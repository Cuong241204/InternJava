import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> ds = new ArrayList<>();
        ds.add(new Student(1, "Cuong", 3.5));
        ds.add(new Student(2, "Hong", 3.2));
        ds.add(new Student(3, "Chi", 2.5));
        ds.add(new Student(1, "Nguyen", 2.8)); // trùng id
        ds.add(new Student(4, "Anh", 3.4));

        HashMap<Integer, Student> map = new HashMap<>();

        // Đưa vào map, kiểm tra trùng id
        for(Student s : ds){
            if(map.containsKey(s.getId())){
                System.out.println("Trùng id: " + s.getId() + " -> Không thêm " + s.getName());
            } else {
                map.put(s.getId(), s);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id cần tìm: ");
        int id = sc.nextInt();

        if(map.containsKey(id)){
            System.out.println("Found: " + map.get(id));
        } else {
            System.out.println("Not found");
        }
    }
}
