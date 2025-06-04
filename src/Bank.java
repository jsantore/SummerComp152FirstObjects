import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
   private ArrayList<BankAccount> allAccounts;
   private ArrayList<Customer> allCustomers;

   public Bank() {
       allCustomers = new ArrayList<Customer>();
       allAccounts = new ArrayList<BankAccount>();
   }

   public void doBanking(){
       Scanner userInputReader = new Scanner(System.in);
       while(true){
           printMenu();
           var choice = userInputReader.nextInt();
           if(choice == 4){
               System.exit(0);
           }else if(choice == 1){
               createCustomer(userInputReader);
           }else if(choice == 2){
                createAccount(userInputReader);
           }
       }
   }

    private void createAccount(Scanner userInputReader) {
       System.out.print("How much do you want to deposit? : ");
       double depositAmount = userInputReader.nextDouble();
       System.out.print("Enter interest rate: ");
       float interestRate = userInputReader.nextFloat();
       BankAccount newAccount = new BankAccount(depositAmount, interestRate);
       allAccounts.add(newAccount);
       System.out.print("What is the customer number for the account?: ");
       int customerNumber = userInputReader.nextInt();
       boolean accountExists = false;
       for(Customer customer : allCustomers){
           if (customerNumber == customer.getCustomerId()){
               customer.openAccount(newAccount);
               accountExists = true;
           }
       }
       if(!accountExists){
           System.out.println("Customer " + customerNumber + " does not exist.");
       }
    }

    private void createCustomer(Scanner userInputReader) {
       System.out.println("Please enter the tax Id of the new customer: ");
       var taxId = userInputReader.nextInt();
       System.out.println("Please enter the name of the customer: ");
       userInputReader.nextLine();//get rid of dangling \n
       var name = userInputReader.nextLine();
       System.out.println("Creating Customer " + taxId + " with name " + name);
       var customer = new Customer(name, taxId);
       allCustomers.add(customer);
    }

    private void printMenu(){
       System.out.println("Welcome to the Bank");
       System.out.println("Please choose one of the following options:");
       System.out.println("[1] Create Customer");
       System.out.println("[2] Create Account");
       System.out.println("[3] Close Account");
       System.out.println("[4] Exit");

   }
}
