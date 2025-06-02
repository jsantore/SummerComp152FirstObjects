//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


void main(){
    var profsAccount = new BankAccount();
    profsAccount.deposit(1000);
    System.out.println("Profs account balance: " + profsAccount.checkBalance());
    profsAccount.withdraw(100);
    System.out.println("Profs account balance: " + profsAccount.checkBalance());
    if (profsAccount.withdraw(1000)) {
        System.out.println("Profs account balance: " + profsAccount.checkBalance());
    } else {
        System.out.println("Insufficient funds");
    }
}