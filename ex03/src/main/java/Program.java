import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User user = new User("Ira SH");

        Transactions transaction1 = new Transactions(UUID.randomUUID(), 1000.00);
        Transactions transaction2 = new Transactions(UUID.randomUUID(), 2000.50);
        Transactions transaction3 = new Transactions(UUID.randomUUID(), 500.75);

        user.addTransaction(transaction1);
        user.addTransaction(transaction2);
        user.addTransaction(transaction3);

        System.out.println("All user transactions: ");
        for( Transactions transaction : user.getAllTransactions()) {
            System.out.println(transaction);
        }
        try {

            user.removeTransactionById(transaction2.getTransactionId());
        } catch (TransactionNotFoundException e) {
            System.err.println(e.getMessage());
        }

System.out.println("\nAfter delete one transaction:");
        for(Transactions transaction : user.getAllTransactions()) {
            System.out.println(transaction);
        }
    }
}


