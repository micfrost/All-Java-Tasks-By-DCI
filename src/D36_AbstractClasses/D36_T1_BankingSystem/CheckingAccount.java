package D36_AbstractClasses.D36_T1_BankingSystem;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println();
        System.out.println("BankAccount\nAccount Number: " + getAccountNumber() +
                ", \nAccount Holder " + getAccountHolder() +
                ", \nBalance: " + getBalance() +
                "\nOverdraft Limit: " + overdraftLimit);
    }
}
