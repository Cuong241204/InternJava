package service;

import exception.InvalidAgeException;
import exception.InvalidPasswordException;
import exception.UserNotFoundException;
import model.User;
import repository.UserRepository;

public class AuthService {

    private UserRepository repository;

    public AuthService(UserRepository repository) {
        this.repository = repository;
    }

    public void register(User user) {
        if (user.getAge() < 0) {
            throw new InvalidAgeException("Tuổi không hợp lệ!");
        }

        if (user.getPassWord().length() < 6) {
            throw new InvalidPasswordException("Password phải >= 6 ký tự!");
        }

        repository.add(user);
    }

    public void login(String username, String password) {

        User user = repository.findByUsername(username);

        if (user == null) {
            throw new UserNotFoundException("Không tìm thấy user!");
        }

        // ⚠ DÙNG equals(), KHÔNG dùng ==
        if (!user.getPassWord().equals(password)) {
            throw new InvalidPasswordException("Sai mật khẩu!");
        }

        System.out.println("Login thành công!");
    }
}