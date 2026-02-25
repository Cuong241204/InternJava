import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> ds = new ArrayList<>();
        ds.add(new Circle(4));
        ds.add(new Circle(3.5));
        ds.add(new Rectangle(6, 4));
        for(Shape s : ds){
            System.out.println(s);
        }


    }
}