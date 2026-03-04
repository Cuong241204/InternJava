import java.util.ArrayList;
import java.util.List;
public class Box<T> {
    private List<T> ds;
    public Box(){
        ds = new ArrayList<>();
    }
    public void add(T item){
        if(item == null){
            throw new IllegalArgumentException("Not null");
        }
        ds.add(item);
        System.out.println("Thêm thành công " + item);
    }
    public void remove(T item){
        ds.remove(item);
        System.out.println("Xoá thành công ");
    }
    public List<T> findAll(){
        return ds;
    }

}
