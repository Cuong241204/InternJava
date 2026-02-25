import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManage {
    private ArrayList<Product> pd = new ArrayList<>();

    public void printAll(){
        if(pd.isEmpty()){
            System.out.println("Ds rỗng");
            return;
        }
        for(Product a : pd){
            System.out.println(a);
        }
    }
    public boolean checkId(int id){
        for(Product p : pd){
            if(p.getId() == id) return true;
        }
        return false;
    }
    public void addProduct(Product p){
        if(checkId(p.getId())){
            System.out.println("Id đã tồn tại.");
            return;
        }
        pd.add(p);
        System.out.println("Thêm sp thành công.");
    }
    public void updateProduct(int id, String newname, double newprice, int newquant){
        for(Product p : pd){
            if(p.getId() == id){
                p.setName(newname);
                p.setPrice(newprice);
                p.setQuantity(newquant);
                System.out.println("Cập nhật thành công");
                return;
            }
        }
        System.out.println("Ko tìm thấy id.");
    }
    public void removeById(int id){
        for(int i = 0; i < pd.size(); i++){
            if(pd.get(i).getId() == id){
                pd.remove(i);
                System.out.println("Xóa thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy ID.");
    }
    public void searchByName(String keyword){
        boolean found = false;
        keyword = keyword.toLowerCase().trim();
        for(Product p : pd){
            if(p.getName().toLowerCase().contains(keyword)){
                System.out.println(p);
                found = true;
            }
        }
        if(!found){
            System.out.println("Ko tìm thấy");
        }
    }
    public void SortProductByPrice(){
        Collections.sort(pd, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
        System.out.println("Đã sắp xếp giảm dần theo giá.");

    }


}
