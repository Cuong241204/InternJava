import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int n = 100000;

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long start1 = System.nanoTime();

        for(int i = 0; i < n; i++){
            arrayList.add(0, i); // thêm vào đầu
        }

        long end1 = System.nanoTime();
        System.out.println("ArrayList time: " + (end1 - start1) + " ns");

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        long start2 = System.nanoTime();

        for(int i = 0; i < n; i++){
            linkedList.add(0, i); // thêm vào đầu
        }

        long end2 = System.nanoTime();
        System.out.println("LinkedList time: " + (end2 - start2) + " ns");
    }
    // so sánh tốc độ thêm phần tử của ArrayList và LinkList
    // ArrayList lưu dữ liệu theo kiểu mảng , khi thêm 1 ptu mới vào đầu thì phải duyệt và dịch sang phải 1 ô với từng phần tử.
    // LinkedList lưu theo node , ta chỉ việc thay thế vị trí các node bằng con trỏ prev và next.
}
