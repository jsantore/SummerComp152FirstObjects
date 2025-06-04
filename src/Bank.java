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

           }
       }
   }

    private void createCustomer(Scanner userInputReader) {
       System.out.println("Please enter the tax Id of the new customer: ");
       var taxId = userInputReader.nextInt();
       System.out.println("Please enter the name of the customer: ");
       var name = userInputReader.nextLine();
       System.out.println("Creating Customer " + taxId + " with name " + name);
       var customer = new Customer(name, taxId);
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
