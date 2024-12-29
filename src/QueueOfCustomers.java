
import java.util.LinkedList;
import java.util.Queue;

public class QueueOfCustomers {
    private Queue<Customer> customerQueue = new LinkedList();

    public QueueOfCustomers() {
    }

    public void addCustomer(Customer customer) {
        this.customerQueue.add(customer);
    }

    public Customer getNextCustomer() {
        return (Customer)this.customerQueue.poll();
    }

    public boolean isEmpty() {
        return this.customerQueue.isEmpty();
    }

    public int size() {
        return this.customerQueue.size();
    }
}
