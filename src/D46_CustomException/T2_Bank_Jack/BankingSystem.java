package D46_CustomException.T2_Bank_Jack;

public class BankingSystem {

    private BankAccount[] bankAccounts;

    public BankingSystem(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public BankAccount getAccount(int accountNumber) {
        BankAccount accountToReturn = null;
        for (BankAccount bankAccount : bankAccounts) {
            if (accountNumber == bankAccount.getAccountNumber()) {
                accountToReturn = bankAccount;
                break;
            }
        }
        return accountToReturn;
    }

    public double withdraw(BankAccount bankAccount, double amount) throws InsuficientFundsException {
        amount = Math.abs(amount);

        if (bankAccount.getBalance() >= amount) {
            bankAccount.reduceBalance(amount);
        } else {
            throw new InsuficientFundsException("Insufficient Funds.");
        }
        return bankAccount.getBalance();
    }

    public double deposit(BankAccount bankAccount, double amount) {
        amount = Math.abs(amount);

        bankAccount.increaseBalance(amount);

        return bankAccount.getBalance();
    }

}
