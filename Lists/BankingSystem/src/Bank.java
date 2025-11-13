import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>(100);
    }

    public boolean addBranch(String nameOfBranch) {

        if (findBranch(nameOfBranch) != null) {
            return false;
        }

        branches.add(new Branch(nameOfBranch));

        return true;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {

        var branch = findBranch(nameOfBranch);

        if (branch == null) {
            return false;
        }

        branch.newCustomer(nameOfCustomer, initialTransaction);

        return true;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction){

        var branch = findBranch(nameOfBranch);

        if (branch == null) {
            return false;
        }

        branch.addCustomerTransaction(nameOfCustomer, transaction);

        return true;
    }

    private Branch findBranch(String nameOfBranch) {

        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(nameOfBranch)) {
                return branch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}