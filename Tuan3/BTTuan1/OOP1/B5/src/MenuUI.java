import java.util.Scanner;

public class MenuUI {
    private StudentService service = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n===== STUDENT MANAGEMENT =====");
        System.out.println("1. Thêm sinh viên: ");
        System.out.println("2. Cập nhật theo id: ");
        System.out.println("3. Xoá theo id: ");
        System.out.println("4. Tìm kiếm theo tên: ");
        System.out.println("5. In danh sách: ");
        System.out.println("0. Thoát: ");
        System.out.print("Choose: ");
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addStudentUI();
                    break;
                case 2:
                    updateStudentUI();
                    break;
                case 3:
                    deleteStudentUI();
                    break;
                case 4:
                    searchStudentUI();
                    break;
                case 5:
                    showAllStudentsUI();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void addStudentUI() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        Student s = new Student(id, name, age, gpa);
        service.addStudent(s);
    }

    private void updateStudentUI() {
        System.out.print("Nhập id cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi mới: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập GPA mới: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        service.updateStudentById(id, name, age, gpa);
    }

    private void deleteStudentUI() {
        System.out.print("Nhập id cần xoá: ");
        int id = Integer.parseInt(scanner.nextLine());

        service.deleteStudent(id);
    }

    private void searchStudentUI() {
        System.out.print("Nhập tên cần tìm: ");
        String keyword = scanner.nextLine();

        service.searchByName(keyword);
    }

    private void showAllStudentsUI() {
        service.printAll();
    }
}
