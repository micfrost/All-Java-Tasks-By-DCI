package D46_CustomException.T2_BankingSystem;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private int pin;

    public BankAccount(int accountNumber, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public void withdraw(double withdrawAmount) throws InsufficientFundsException {
        try {

            if (balance >= withdrawAmount) {
                System.out.println("Withdraw from an account No: " + accountNumber);
                System.out.println("Old balance: \t" + balance + "€");
                System.out.println("Withdraw: \t\t" + withdrawAmount + "€");
                balance -= withdrawAmount;
                System.out.println("New balance: \t" + balance + "€");
                System.out.println();
            } else {
                throw new InsufficientFundsException("Oh no:  insufficient funds.\n");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public void deposit(double depositAmount) {
        System.out.println("Deposit to an account No: " + accountNumber);
        System.out.println("Old balance: \t" + balance + "€");
        System.out.println("Deposit: \t\t" + depositAmount + "€");
        balance += depositAmount;
        System.out.println("New balance: \t" + balance + "€");
        System.out.println();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", balance: " + balance +
                ", pin: " + pin;
    }
}
