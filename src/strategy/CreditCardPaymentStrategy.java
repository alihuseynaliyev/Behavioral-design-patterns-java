package strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    private final String cardNumber;
    private final String cvv;
    private final String expiredDate;

    public CreditCardPaymentStrategy(String cardNumber, String cvv, String expiredDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiredDate = expiredDate;
    }


    @Override
    public void pay(double amount) {
        System.out.println("This is a credit card payment strategy");
    }
}
