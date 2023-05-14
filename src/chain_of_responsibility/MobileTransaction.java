package chain_of_responsibility;

public class MobileTransaction extends Transaction {
    @Override
    public void process(int amount) {
        if (amount <= 1000) {
            System.out.println(amount + " withdrawn via Mobile");
        } else if (next != null) {
            next.process(amount);
        }
    }
}
