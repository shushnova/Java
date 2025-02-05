import java.util.UUID;

public interface TransactionsList {
    void addTransaction(Transactions transaction);
    void removeTransactionById(UUID id) throws TransactionNotFoundException;
    Transactions[] toArray();

}