package D68_FunctionalProg_Improve.DC_T_3_FP3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private int nextAccountNumber;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.nextAccountNumber = 1;
    }

    public void openAccount(String accountHolder, double initialBalance, String accountType) {
        Account newAccount = new Account(nextAccountNumber++, accountHolder, initialBalance, accountType);
        accounts.add(newAccount);
        System.out.println("Account opened successfully. Account number: " + newAccount.getAccountNumber());
    }

    public void displayAccounts() {
        System.out.println("Accounts in the Bank:");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() +
                    " - Holder: " + account.getAccountHolder() +
                    " - Balance: $" + account.getBalance() +
                    " - Type: " + account.getAccountType());
        }
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
