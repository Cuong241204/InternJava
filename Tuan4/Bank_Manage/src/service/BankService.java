package service;

import model.BankAccount;
import repository.BankRepository;
import exception.DuplicateAccountException;
import exception.InsufficientBalanceException;

public class BankService {

    private BankRepository repo = new BankRepository();

    public void createAccount(BankAccount account) {
        if (repo.findByAccountNum(account.getAccountNum()) != null) {
            throw new DuplicateAccountException("Tài khoản đã tồn tại!");
        }
        repo.add(account);
    }

    public void deposit(String accNumber, double amount) {
        BankAccount acc = repo.findByAccountNum(accNumber);

        if (acc == null) {
            throw new RuntimeException("Không tìm thấy tài khoản!");
        }

        acc.deposit(amount);
    }

    public void withdraw(String accNumber, double amount)
            throws InsufficientBalanceException {

        BankAccount acc = repo.findByAccountNum(accNumber);

        if (acc == null) {
            throw new RuntimeException("Không tìm thấy tài khoản!");
        }

        if (acc.getBalance() < amount) {
            throw new InsufficientBalanceException("Số dư không đủ!");
        }

        acc.withdraw(amount);
    }

    public void showAll() {
        repo.findAll().forEach(System.out::println);
    }
}