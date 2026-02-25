import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement ep = new EmployeeManagement();

        while(true){
            System.out.println("\n===== MENU QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm nhân viên: ");
            System.out.println("2. Sửa nv theo ID");
            System.out.println("3. Xóa nv theo ID");
            System.out.println("4. Tìm nv theo tên");
            System.out.println("5. Sắp xếp theo lương giảm dần");
            System.out.println("6. Tìm nhân viên lương cao nhất: ");
            System.out.println("7. In danh sách sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) {
                System.out.println("Thoát chương trình!");
                break;
            }

            switch(choice){
                case 1:
                    System.out.println("Nhập id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();

                    System.out.println("Nhập lương: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Nhập phòng: ");
                    String depart = sc.nextLine();
                    ep.addEmployee(new Employee(id, name, salary, depart));
                    break;
                case 2:
                    System.out.print("Nhập ID cần sửa: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Nhập lương mới: ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Nhập phòng mới: ");
                    String newDepart = sc.nextLine();

                    ep.updateEmployee(idUpdate, newName, newPrice, newDepart);
                    break;
                case 3:
                    System.out.print("Nhập ID cần xóa: ");
                    int idDelete = sc.nextInt();
                    sc.nextLine();

                    ep.removeById(idDelete);
                    break;
                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();

                    ep.searchByName(keyword);
                    break;

                case 5:
                    ep.SortBySalary();
                    break;
                case 6:
                    ep.findMaxSalary();
                    break;
                case 7:
                    ep.printAll();
                default:
                    System.out.println("Lựa chọn ko hợp lệ");


            }
        }
        sc.close();

    }
}