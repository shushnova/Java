import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

class TransactionNode{
    private final Transactions data;
    private TransactionNode next;
    public TransactionNode(Transactions data) {
        this.data = data;
    }
    public Transactions getData() {
        return data;
    }
    public TransactionNode getNext() {
        return next;
    }

    public void setNext(TransactionNode next) {
        this.next = next;
    }
}

public class TransactionsLinkedList implements TransactionsList {

    private TransactionNode head;
    private int size;

    @Override
    public void addTransaction(Transactions transaction) {
        TransactionNode newNode = new TransactionNode(transaction);
        if (head == null) {
            head = newNode;
        } else {
            TransactionNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public void removeTransactionById(UUID id) throws TransactionNotFoundException {
        if(head == null) {
            throw new TransactionNotFoundException("Empty list");
        }
        TransactionNode previous = null;
        TransactionNode current = head;

        while (current != null && !current.getData().getTransactionId().equals(id)){
            previous = current;
            current = current.getNext();
        }
        if(current == null) {
            throw new TransactionNotFoundException("Not found transaction with this id");
        }
        // Если удаляемая транзакция является первой
        if(previous == null){
            head = current.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        size--;

    }
    @Override
    public Transactions[] toArray() {
        Transactions[] result = new Transactions[size];
        int index = 0;
        for(TransactionNode node = head; node != null; node = node.getNext()) {
            result[index++] = node.getData();
        }
        return result;
    }

    public int getSize() {
        return size;
    }
}
