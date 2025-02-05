import java.util.UUID;

public class User {

    private String name;
    private TransactionsList transactions;
    public User(String name) {

        this.name = name;
        this.transactions = new TransactionsLinkedList();
    }


 public void addTransaction(Transactions transaction) {
        transactions.addTransaction(transaction);
 }

 public void removeTransactionById(UUID transactionId) throws TransactionNotFoundException {
        transactions.removeTransactionById(transactionId);
 }

public Transactions[] getAllTransactions(){
        return transactions.toArray();
}


    public String getName() {
        return name;
    }
}