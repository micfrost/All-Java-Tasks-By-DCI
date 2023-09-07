package D36_AbstractClasses.D36_T1_BankingSystem;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
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
                "\nInterest Rate: " + interestRate);
    }

}