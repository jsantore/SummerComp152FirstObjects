import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;
    private int customerId;

    public Customer(String CustomerName, int taxId) {
        accounts = new ArrayList<BankAccount>();
        name = CustomerName;
        customerId = taxId;
    }

    public int getCustomerId(){
        return customerId;
    }

    public String getName() {
        return name;
    }

    public boolean openAccount(double initialDeposit){
        var newCustomerAccount = new BankAccount(initialDeposit, 0.03f);
        var didItWork = accounts.add(newCustomerAccount);
        return didItWork;
    }

    public boolean openAccount(BankAccount account){
        var didItWork = accounts.add(account);
        return didItWork;
    }

    public BankAccount closeAccount(int BankAccountId){
        BankAccount closedAccount = null;
        for(var account : accounts){
            if (account.getAccountNumber() == BankAccountId){
                closedAccount = account;
                break;
            }
        }
        if(closedAccount==null){
            return null;
        }
        accounts.remove(closedAccount);
        return closedAccount;
    }



}
