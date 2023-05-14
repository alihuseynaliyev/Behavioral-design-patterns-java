package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        var atmTransaction = new ATMTransaction();
        var mobileTransaction = new MobileTransaction();
        var branchTransaction = new BranchTransaction();
        atmTransaction.setNext(mobileTransaction);
        mobileTransaction.setNext(branchTransaction);

        atmTransaction.process(400);
        atmTransaction.process(1040);
        atmTransaction.process(600000);
    }
}
