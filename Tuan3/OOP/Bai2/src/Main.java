import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> ds = new ArrayList<>();
        ds.add(new Circle(5));
        ds.add(new Rectangle(4, 3));
        for(Shape s : ds){
            System.out.println(s);
        }


    }
}