package observer.subscriber;

public class BankEmployee implements Observer {
    private String name;

    public BankEmployee(String name) {
        this.name = name;
    }

    @Override
    public void update(double amount) {
        System.out.println("Bank employee " + name + " has been notified. New balance: " + amount);
    }
}
