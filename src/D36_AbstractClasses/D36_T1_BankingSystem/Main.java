package D36_AbstractClasses.D36_T1_BankingSystem;

public class Main {

    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount();
        savingsAccount1.setAccountNumber("DE45-1223-2232-3223-2233");
        savingsAccount1.setAccountHolder("Jonathan Smith");
        savingsAccount1.setBalance(5000);
        savingsAccount1.deposit(1000);
        savingsAccount1.withdraw(200);
        savingsAccount1.setInterestRate(4.5);
        savingsAccount1.displayAccountInfo();

        CheckingAccount checkingAccount1 = new CheckingAccount();
        checkingAccount1.setAccountNumber("DE45-6788-655-3223-2233");
        checkingAccount1.setAccountHolder("Petra Smith");
        checkingAccount1.setBalance(9000);
        checkingAccount1.deposit(9000);
        checkingAccount1.withdraw(75);
        checkingAccount1.setOverdraftLimit(4000);
        checkingAccount1.displayAccountInfo();
    }
}
