package observer.publisher;

import observer.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount implements Subject {

    private double balance;
    private List<Observer> observers;

    public BankAccount() {
        observers = new ArrayList<>();
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        notifyObservers();
    }

    public void withdraw(double amount) {
        balance -= amount;
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(balance));
    }
}
