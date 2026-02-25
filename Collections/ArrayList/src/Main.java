import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(12);
        a.add(5);
        a.add(8);
        a.add(9);
        a.add(3);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.set(0, 100);
        System.out.println(a);
        System.out.print("Nhập phần tử cần tìm: ");
        int x = sc.nextInt();
//        int index = a.indexOf(x);
//        if(index != -1){
//            System.out.println("Tìm thấy: "+ x +" - " + "vị trí: " + found);
//        }
//        else{
//            System.out.println("Ko tìm thấy");
//        }
        boolean  found = false;
        for(int i=0; i<a.size(); i++){
            if(x == a.get(i))
            {
                System.out.println("Tìm thấy " + x + " vị trí: " + i);
                found = true;
            }

        }
        if(!found){
            System.out.println("Ko tìm thấy.");
        }
        a.removeIf(s -> s%2 ==0);
        System.out.println("Sau khi xoa cac ptu chan: ");
        System.out.println(a);
        int sum = 0;
        for(int i=0; i<a.size(); i++){
            int value = a.get(i);
            sum += value;
        }
        System.out.println("Tổng = "+sum);





    }
}