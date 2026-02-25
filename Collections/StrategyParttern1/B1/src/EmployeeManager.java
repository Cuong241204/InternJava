import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManager {
    public ArrayList<Employee> ds = new ArrayList<>();
    public void printAll(){
        if(ds.isEmpty()){
            System.out.println("Ds rỗng");
        }
        for(Employee e : ds){
            System.out.println(e);
        }
    }
    public boolean checkId(int id){
        for(Employee e : ds){
            if(e.getId() == id) return true;
        }
        return false;
    }
    public void addEmployee(Employee e){
        if(checkId(e.getId())){
            System.out.println("Id đã tồn tại.");
            return;
        }
        ds.add(e);
        System.out.println("Thêm thành công.");

    }
    public void removeById(int id){
        for(int i=0; i<ds.size(); i++){
            if(ds.get(i).getId() == id){
                ds.remove(i);
                System.out.println("Xoá thành công.");
                return;
            }
        }
        System.out.println("Ko tìm thấy id.");
    }
    public void updateById(int id, String name, String department){
        for(Employee e : ds){
            if(e.getId() == id){
                e.setName(name);
                e.setDepart(department);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Ko tìm thấy id");
    }
    public void searchByName(String keyword){
        boolean found = false;
        keyword = keyword.toLowerCase().trim();
        for(Employee e : ds){
            if(e.getName().toLowerCase().contains(keyword)){
                System.out.println(e);
                found = true;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy tên.");
        }
    }
    public void maxSalary(){
        double max = ds.get(0).calculateSalary();
        for(Employee e : ds){
            if(e.calculateSalary() > max){
                max = e.calculateSalary();
            }
        }
        System.out.println("Nv có lương cao nhất: ");
        for(Employee e : ds){
            if(e.calculateSalary() == max){
                System.out.println(e);
            }
        }
    }
    public void sortEmployee(SortStrategy strategy) {
        strategy.sort(ds);
        System.out.println("Đã sắp xếp!");
    }

}
