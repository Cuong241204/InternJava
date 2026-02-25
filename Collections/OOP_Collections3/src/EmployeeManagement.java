import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManagement {
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
    public void updateEmployee(int id, String newname, double newsalary, String newdepart){
        for(Employee e : ds){
            if(e.getId() == id){
                e.setName(newname);
                e.setSalary(newsalary);
                e.setDepart(newdepart);
                System.out.println("Cập nhật thành công.");
            }
        }
        System.out.println("Ko tìm thấy id cần sửa.");
    }
    public void addEmployee(Employee e){
        if(checkId(e.getId())){
            System.out.println("Không được trùng id");
            return;
        }
        ds.add(e);
        System.out.println("Thêm thành công.");

    }
    public void updateById(int id, String name, double salary, String department){
        for(Employee e : ds){
            if(e.getId() == id){
                e.setName(name);
                e.setSalary(salary);
                e.setDepart(department);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Ko tìm thấy id.");

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
            System.out.println("Ko tìm thấy.");
        }
    }
    public void SortBySalary(){
        Collections.sort(ds, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });
        System.out.println("Sắp xếp thành công.");
    }
    public void findMaxSalary(){
        double max = ds.get(0).getSalary();
        for(Employee e : ds){
            if(e.getSalary() > max){
                max = e.getSalary();
            }
        }
        System.out.println("Nv có lương cao nhất: ");
        for(Employee a : ds){
            if(a.getSalary() == max){
                System.out.println(a);
            }
        }
    }
}
