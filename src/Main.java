//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


void main(){
    var profsAccount = new BankAccount(1000, 0.05f);
    var yourAccount = new BankAccount(500, 0.02f);
    yourAccount.deposit(500);
    profsAccount.deposit(1000);
    profsAccount.addInterest();
    yourAccount.addInterest();
    System.out.println("Profs account balance: " + profsAccount.checkBalance());
    System.out.println("Your account balance: " + yourAccount.checkBalance());
    profsAccount.withdraw(100);
    System.out.println("Profs account balance: " + profsAccount.checkBalance());
    System.out.println("Your account balance: " + yourAccount.checkBalance());
    if (profsAccount.withdraw(1000)) {
        System.out.println("Profs account balance: " + profsAccount.checkBalance());
    } else {
        System.out.println("Insufficient funds");
    }
}