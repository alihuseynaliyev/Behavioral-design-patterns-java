package observer;

import observer.publisher.BankAccount;
import observer.subscriber.BankEmployee;

public class Main {
    public static void main(String[] args) {
        var bankAccount = new BankAccount();
        bankAccount.registerObserver(new BankEmployee("Ali"));
        bankAccount.registerObserver(new BankEmployee("Nazim"));

        bankAccount.deposit(100);
        bankAccount.withdraw(30);
        System.out.println(bankAccount.getBalance());
    }
}
