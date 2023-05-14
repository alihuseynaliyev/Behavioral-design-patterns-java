package chain_of_responsibility;

public abstract class Transaction {
    protected Transaction next;

    public void setNext(Transaction next){
        this.next = next;
    }

    public abstract void process(int amount);
}
