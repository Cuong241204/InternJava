import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        l.addFirst(1);
        System.out.println(l);
        l.addLast(30);
        l.add(2, 25);
        System.out.println(l);
        System.out.println("Nhập cần tìm: ");
        int x = sc.nextInt();
        int index = l.indexOf(x);
        if(index != -1){
            System.out.println("Tìm thấy: "+ x + " vị trí "+ index);
        }
        else{
            System.out.println("Ko tìm thấy");
        }
        l.removeIf(a -> a ==15);
        System.out.println("List sau khi xoá: ");
        System.out.println(l);
        System.out.println("Duyệt ngược: ");
        Iterator<Integer> it = l.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }




    }
}