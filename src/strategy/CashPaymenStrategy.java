package strategy;

public class CashPaymenStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("This is a cash payment strategy");
    }
}
