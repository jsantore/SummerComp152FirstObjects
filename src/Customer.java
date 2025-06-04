import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;
    private int customerId;

    public Customer(){
        accounts = new ArrayList<BankAccount>();
    }

    public int getCustomerId(){
        return customerId;
    }

    public boolean openAccount(double initialDeposit){
        var newCustomerAccount = new BankAccount(initialDeposit, 0.03f);
        var didItWork = accounts.add(newCustomerAccount);
        return didItWork;
    }




}
