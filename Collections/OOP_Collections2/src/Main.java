import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManage ds = new ProductManage();

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Tìm sản phẩm theo tên");
            System.out.println("5. Sắp xếp theo giá giảm dần");
            System.out.println("6. In danh sách sản phẩm");
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

                    System.out.print("Nhập giá: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Nhập số lượng: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    ds.addProduct(new Product(id, name, price, quantity));
                    break;

                case 2:
                    System.out.print("Nhập ID cần sửa: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Nhập giá mới: ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Nhập số lượng mới: ");
                    int newQuan = sc.nextInt();
                    sc.nextLine();

                    ds.updateProduct(idUpdate, newName, newPrice, newQuan);
                    break;

                case 3:
                    System.out.print("Nhập ID cần xóa: ");
                    int idDelete = sc.nextInt();
                    sc.nextLine();

                    ds.removeById(idDelete);
                    break;

                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();

                    ds.searchByName(keyword);
                    break;

                case 5:
                    ds.SortProductByPrice();
                    break;

                case 6:
                    ds.printAll();
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        sc.close();
    }
}
