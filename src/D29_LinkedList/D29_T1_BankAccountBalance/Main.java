package D29_LinkedList.D29_T1_BankAccountBalance;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Double> accountBalances = new LinkedList<>();
        addAccount(accountBalances, 1000.0);
        addAccount(accountBalances, 1500.0);
        addAccount(accountBalances, 500.0);
        displayBalances(accountBalances);

    }


    static void addAccount(LinkedList<Double> list, double initialBalance) {
        list.add(initialBalance);

    }

    static void displayBalances(LinkedList<Double> list) {
        System.out.println("Account Balances: ");
        int accountNo = 0;
        for (double item : list
        ) {
            accountNo++;
            System.out.println("Account no.: " + accountNo + ": $ " + item);

        }
    }

}
