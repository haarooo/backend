package day07;

public class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;

    public BankAccount(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    int deposit(int 입금액){
        balance = balance + 입금액;
        return  balance;
    }
    int withdraw(int 출금액){
        balance = balance - 출금액;
        return balance;
    }
}
