import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên theo ID");
            System.out.println("3. Xóa sinh viên theo ID");
            System.out.println("4. Tìm sinh viên theo tên");
            System.out.println("5. Sắp xếp theo GPA giảm dần");
            System.out.println("6. Tìm GPA cao nhất");
            System.out.println("7. In danh sách sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 0) {
                System.out.println("Thoát chương trình!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();

                    manager.addStudent(new Student(id, name, gpa));
                    break;

                case 2:
                    System.out.print("Nhập ID cần sửa: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Nhập GPA mới: ");
                    double newGpa = sc.nextDouble();
                    sc.nextLine();

                    manager.resestStudent(idUpdate, newName, newGpa);
                    break;

                case 3:
                    System.out.print("Nhập ID cần xóa: ");
                    int idDelete = sc.nextInt();
                    sc.nextLine();

                    manager.removeStudent(idDelete);
                    break;

                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();

                    manager.searchByName(keyword);
                    break;

                case 5:
                    manager.SortByGpa();
                    break;

                case 6:
                    manager.findMaxGpa();
                    break;

                case 7:
                    manager.printAll();
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        sc.close();
    }
}
