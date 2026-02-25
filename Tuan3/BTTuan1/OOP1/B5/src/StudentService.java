import java.util.ArrayList;
public class StudentService {
    public ArrayList<Student> ds = new ArrayList<>();
    public boolean checkId(int id){
        for(Student s : ds){
            if(s.getId()==id){
                return true;
            }
        }
        return false;
    }
    public boolean addStudent(Student s){
        if(!checkId(s.getId())){
            ds.add(s);
            System.out.println("Thêm thành công.");
        }
        else{
            System.out.println("Id đã tồn tại.");
        }

        return false;
    }
    public void updateStudentById(int id, String name, int age, double gpa){
        for(Student s : ds){
            if(s.getId() == id){
                s.setName(name);
                s.setAge(age);
                s.setGpa(gpa);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Id không tồn tại.");
    }
    public void deleteStudent(int id){
        for(int i = 0; i<ds.size(); i++){
            if(ds.get(i).getId() == id){
                ds.remove(i);
                System.out.println("Xoá thành công.");
                return;
            }
        }
        System.out.println("Id không tồn tại.");

    }
    public void searchByName(String keyword){
        boolean found = false;
        keyword = keyword.toLowerCase().trim();
        for(Student s : ds){
            if(s.getName().toLowerCase().contains(keyword)){
                System.out.println("Tìm kiếm thành công: "  +s);
                found = true;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy.");
        }

    }
    public void printAll(){
        if(ds.isEmpty()){
            System.out.println("Danh sách rỗng.");
            return;
        }
        for(Student s : ds){
            System.out.println(s);
        }
    }


}



