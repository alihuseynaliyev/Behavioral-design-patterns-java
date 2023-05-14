package chain_of_responsibility;

public class ATMTransaction extends Transaction {
    @Override
    public void process(int amount) {
        if (amount <= 500) {
            System.out.println(amount + " withdrawn via ATM");
        } else if (next != null) {
            next.process(amount);
        }
    }
}
