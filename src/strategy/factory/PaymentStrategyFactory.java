package strategy.factory;

import strategy.CashPaymenStrategy;
import strategy.CreditCardPaymentStrategy;
import strategy.PaymentStrategy;

public class PaymentStrategyFactory {

    public static PaymentStrategy getPaymentStrategyInstance(String paymentStrategyName
            , String cardNumber, String cvv, String expiredDate) {
        if (paymentStrategyName.equalsIgnoreCase("CreditCard"))
            return new CreditCardPaymentStrategy(cardNumber, cvv, expiredDate);
        return null;
    }

    public static PaymentStrategy getPaymentStrategyInstance(String paymentStrategyName) {
        if (paymentStrategyName.equalsIgnoreCase("Cash"))
            return new CashPaymenStrategy();
        return null;
    }
}
