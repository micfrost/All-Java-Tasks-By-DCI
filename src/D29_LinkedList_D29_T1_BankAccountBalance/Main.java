package D29_LinkedList_D29_T1_BankAccountBalance;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Double> accountBalances = new LinkedList<>();
        addAccount(accountBalances, 1000.0);
        addAccount(accountBalances, 1500.0);
        addAccount(accountBalances, 500.0);
        displayBalances(accountBalances);

    }


    static void addAccount(LinkedList<Double> accounts, double initialBalance) {
        accounts.add(initialBalance);

    }

    static void displayBalances(LinkedList<Double> accounts) {
        System.out.println("Account Balances: ");
        int accountNo = 0;
        for (double account : accounts
        ) {
            accountNo++;
            System.out.println("Account no.: " + accountNo + ": $" + account);

        }
    }

}
