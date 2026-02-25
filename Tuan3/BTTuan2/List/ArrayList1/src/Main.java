import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        for(int i=1; i<=20; i++){
            ds.add(i);
        }
        System.out.println(ds);
        ds.removeIf(x->x%2==0);
        System.out.println("Ds sau khi xoa ptu chan: ");
        System.out.println(ds);

        //Thêm vào cuối list
        ds.add(100);
        System.out.println(ds);



    }
}