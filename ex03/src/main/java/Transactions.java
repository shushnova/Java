import java.util.UUID;

public class Transactions {
    public static String transactionId;
//    private final String transactionId;
private double amount;
private Transactions next;

    public Transactions(UUID uuid, double amount) {
        this.transactionId = UUID.randomUUID().toString();
        this.amount = amount;
    }

    public UUID getTransactionId() {
        return UUID.fromString(transactionId);
    }

    public double getAmount() {
        return amount;
    }

    public Transactions getNext() {
        return next;
    }

    public void setNext(Transactions next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Amount: " + amount;
    }
}