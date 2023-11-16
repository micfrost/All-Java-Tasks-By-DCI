package D68_FunctionalProg_Improve.DC_T_3_FP3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Open Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter initial balance: $");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter account type (Savings/Checking): ");
                    String accountType = scanner.nextLine().toUpperCase();
                    bank.openAccount(accountHolder, initialBalance, accountType);
                    break;
                case 2:
                    bank.displayAccounts();
                    break;
                case 3:
                    performTransaction(scanner, bank, "deposit");
                    break;
                case 4:
                    performTransaction(scanner, bank, "withdraw");
                    break;
                case 5:
                    performTransfer(scanner, bank);
                    break;
                case 0:
                    System.out.println("Exiting the Banking System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void performTransaction(Scanner scanner, Bank bank, String transactionType) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Account account = findAccountByNumber(bank, accountNumber);
        if (account != null) {
            switch (transactionType) {
                case "deposit":
                    account.deposit(amount);
                    break;
                case "withdraw":
                    account.withdraw(amount);
                    break;
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void performTransfer(Scanner scanner, Bank bank) {
        System.out.print("Enter source account number: ");
        int sourceAccountNumber = scanner.nextInt();
        System.out.print("Enter destination account number: ");
        int destinationAccountNumber = scanner.nextInt();
        System.out.print("Enter transfer amount: $");
        double transferAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Account sourceAccount = findAccountByNumber(bank, sourceAccountNumber);
        Account destinationAccount = findAccountByNumber(bank, destinationAccountNumber);

        if (sourceAccount != null && destinationAccount != null) {
            sourceAccount.transfer(destinationAccount, transferAmount);
        } else {
            System.out.println("One or both accounts not found!");
        }
    }

    private static Account findAccountByNumber(Bank bank, int accountNumber) {
        for (Account account : bank.getAccounts()) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}