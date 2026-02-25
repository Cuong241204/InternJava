import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ NHÂN VIÊN =====");
            System.out.println("1. Thêm FullTimeEmployee");
            System.out.println("2. Thêm PartTimeEmployee");
            System.out.println("3. Xóa theo ID");
            System.out.println("4. Tìm theo tên");
            System.out.println("5. In danh sách");
            System.out.println("6. Nhân viên lương cao nhất");
            System.out.println("7. Sort theo lương giảm dần");
            System.out.println("8. Sort theo tên tăng dần");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 0) {
                System.out.println("Thoát chương trình!");
                break;
            }

            switch (choice) {
                case 1: {
                    try {
                        System.out.print("Nhập ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();

                        System.out.print("Nhập phòng ban: ");
                        String dept = sc.nextLine();

                        System.out.print("Nhập lương cơ bản: ");
                        double baseSalary = Double.parseDouble(sc.nextLine());

                        System.out.print("Nhập bonus: ");
                        double bonus = Double.parseDouble(sc.nextLine());

                        manager.addEmployee(new FullTimeEmployee(id, name, dept, baseSalary, bonus));
                    } catch (Exception e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                }

                case 2: {
                    try {
                        System.out.print("Nhập ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();

                        System.out.print("Nhập phòng ban: ");
                        String dept = sc.nextLine();

                        System.out.print("Nhập tiền công 1 giờ: ");
                        double hourRate = Double.parseDouble(sc.nextLine());

                        System.out.print("Nhập số giờ làm: ");
                        int hours = Integer.parseInt(sc.nextLine());

                        manager.addEmployee(new PartTimeEmployee(id, name, dept, hourRate, hours));
                    } catch (Exception e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                }

                case 3: {
                    System.out.print("Nhập ID cần xóa: ");
                    int idDelete = Integer.parseInt(sc.nextLine());
                    manager.removeById(idDelete);
                    break;
                }

                case 4: {
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;
                }

                case 5:
                    manager.printAll();
                    break;

                case 6:
                    manager.maxSalary();
                    break;

                case 7:
                    manager.sortEmployee(new SortBySalaryDesc());
                    break;

                case 8:
                    manager.sortEmployee(new SortByNameAsc());
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        sc.close();
    }
}
