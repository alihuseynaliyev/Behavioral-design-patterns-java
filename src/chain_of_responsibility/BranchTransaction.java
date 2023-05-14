package chain_of_responsibility;

public class BranchTransaction extends Transaction {
    @Override
    public void process(int amount) {
        if (amount <= 5000) {
            System.out.println(amount + " withdrawn via Bank branch");
        } else {
            System.out.println("Transaction limit exceeded");
        }
    }
}
