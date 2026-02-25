import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class StudentManager {
    private ArrayList<Student> st = new ArrayList<>();
    public void printAll(){
        if(st.isEmpty()){
            System.out.println("Ds rỗng");
            return;
        }
        for(Student a : st){
            System.out.println(a);
        }
    }
    public boolean checkId(int id){
        for(Student a : st){
            if(a.getId()==id) return true;
        }
        return false;
    }
    public void addStudent(Student s){
        if(checkId(s.getId())){
            System.out.println("Mã sinh viên đã tồn tại.");
            return;
        }
        st.add(s);
        System.out.println("Thêm thành công.");

    }
    public void resestStudent(int id, String nameNew, double gpaNew){
        for(Student s : st){
            if(s.getId() == id){
                s.setName(nameNew);
                s.setGpa(gpaNew);
                System.out.println("Sửa thành công.");
                return;
            }
        }
        System.out.println("Ko tìm thấy id.");
    }
    public void removeStudent(int id){
        for(int i=0; i<st.size(); i++){
            if(st.get(i).getId() == id){
                st.remove(i);
                System.out.println("Xoá thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy id.");
    }
    public void searchByName(String keyword){
        boolean found = false;
        keyword = keyword.toLowerCase().trim();
        for(Student s : st){
            if(s.getName().toLowerCase().contains(keyword)){
                System.out.println(s);
                found = true;
            }
        }
        if(!found){
            System.out.println("Ko tìm thấy tên phù hợp.");
        }

    }
    public void SortByGpa(){
        Collections.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getGpa(), o1.getGpa());
            }
        });

        System.out.println("Đã sắp xếp GPA giảm dần!");


    }
    public void findMaxGpa(){
        if(st.isEmpty()){
            System.out.println("Danh sách rỗng");
            return;
        }
        double maxGpa = st.get(0).getGpa();
        for(Student s : st){
            if(s.getGpa() > maxGpa){
                maxGpa = s.getGpa();

            }
        }
        System.out.println("Sinh viên có điểm cao nhất: ");
        for(Student s : st){
            if(s.getGpa() == maxGpa){
                System.out.println(s);
            }
        }

    }


}
