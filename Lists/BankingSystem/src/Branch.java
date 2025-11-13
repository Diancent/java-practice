import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>(500);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {

        if (findCustomer(nameOfCustomer) != null) {
            return false;
        }

        customers.add(new Customer(nameOfCustomer, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {

        if (findCustomer(nameOfCustomer) == null) {
            return false;
        }

        Customer customer = findCustomer(nameOfCustomer);
        customer.addTransaction(transaction);

        return true;
    }

    private Customer findCustomer(String nameOfCustomer) {

        for (Customer customer : customers) {

            if (customer.getName().equalsIgnoreCase(nameOfCustomer)) {
                return customer;
            }
        }

        return null;
    }
}