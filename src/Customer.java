import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String middleName;
    private ArrayList<BankAccount> accounts;

    public Customer(){
        accounts = new ArrayList<>();
    }

    public void setName(String fName,
                        String lName, String mName){
        firstName = fName;
        lastName = lName;
        middleName = mName;
    }


    public void openAccount(double initialBalance){
        var newAccount = new BankAccount(initialBalance, 0.01f);
        accounts.add(newAccount);
    }

    public String getName(){
        if (middleName == null) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }
}
