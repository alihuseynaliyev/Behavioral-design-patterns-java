package strategy;

import strategy.factory.PaymentStrategyFactory;

import static strategy.factory.PaymentStrategyFactory.getPaymentStrategyInstance;

public class Main {
    public static void main(String[] args) {

        var paymentContext = new PaymentContext(getPaymentStrategyInstance("Cash"));
        paymentContext.pay(100);

        var paymentContext1 = new PaymentContext(PaymentStrategyFactory.getPaymentStrategyInstance("Creditcard", "2112", "323", "20032024"));
        paymentContext1.pay(100);


    }
}
