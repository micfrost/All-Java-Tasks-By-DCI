package D46_CustomException.T2_Bank_Jack;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private int pin;

    public BankAccount(int accountNumber, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void reduceBalance(double amount) {
        balance -= amount;
    }

    public void increaseBalance(double amount) {
        balance += amount;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return String.format("""
                
                Account Number:    %4d
                Balance:        €%6.2f""", getAccountNumber(), getBalance());
    }

}
