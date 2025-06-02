public class BankAccount {
    private double balance;
    private int accountNumber;
    private float interestRate;

    public double checkBalance(){
        return balance;
    }

    public double addInterest(){
        balance += balance * interestRate;
        return balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public boolean withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public void printAccountNumber(){
        System.out.println("Account number: " + accountNumber);
    }

}
