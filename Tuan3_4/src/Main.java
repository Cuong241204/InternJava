import model.User;
import repository.UserRepository;
import service.AuthService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserRepository repository = new UserRepository();
        AuthService authService = new AuthService(repository);

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Show users");
            System.out.println("4. Exit");

            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {

                    case 1:
                        System.out.print("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.print("Username: ");
                        String username = scanner.nextLine();

                        System.out.print("Password: ");
                        String password = scanner.nextLine();

                        System.out.print("Age: ");
                        int age = Integer.parseInt(scanner.nextLine());

                        User user = new User(id, username, password, age);
                        authService.register(user);

                        System.out.println("Đăng ký thành công!");
                        break;

                    case 2:
                        System.out.print("Username: ");
                        String u = scanner.nextLine();

                        System.out.print("Password: ");
                        String p = scanner.nextLine();

                        authService.login(u, p);
                        break;

                    case 3:
                        repository.findAll().forEach(System.out::println);
                        break;

                    case 4:
                        System.out.println("Thoát chương trình.");
                        return;

                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }

            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
}