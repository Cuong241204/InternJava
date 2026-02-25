import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> ds = new HashSet<>();

        System.out.println("Nhập 10 số nguyên: ");
        for(int i=1; i<=10; i++){
            System.out.println("Số thứ "+i + ":");
            int x = sc.nextInt();
            ds.add(x);
        }
        System.out.println("Các phần tử trong set: "+ds);
        System.out.println("Số lượng ptu: "+ds.size());
    }
}