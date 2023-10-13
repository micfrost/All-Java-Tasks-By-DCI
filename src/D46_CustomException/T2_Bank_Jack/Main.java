package D46_CustomException.T2_Bank_Jack;

import java.util.Scanner;

public class Main {

    private Scanner scanner;
    private BankingSystem bankingSystem;

    Main(Scanner scanner, BankingSystem bankingSystem) {
        this.scanner = scanner;
        this.bankingSystem = bankingSystem;

        while (true) {

            System.out.println("Select from the following options:");
            System.out.println("1 - Access Account");
            System.out.println("2 - Exit\n");

            System.out.print("Enter choice: ");

            int choice;

            try {
                choice = Integer.valueOf(scanner.nextLine());

                if (choice < 1 || choice > 2) {
                    System.out.println("\nSelect a number between 1 and 4.\n");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nEnter a valid number!\n");
                continue;
            }

            if (choice == 1) {
                BankAccount bankAccount = accessAccount();
                menu(bankAccount);
                continue;
            }

            if (choice == 2) {
                System.out.println("Good Bye!");
                break;
            }
        }

    }

    public void menu(BankAccount bankAccount) {
        while (true) {

            System.out.println("\nSelect from the following options:");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Display Balance");
            System.out.println("4 - Exit\n");

            System.out.print("Enter choice: ");

            int choice;

            try {
                choice = Integer.valueOf(scanner.nextLine());

                if (choice < 1 || choice > 4) {
                    System.out.println("\nSelect a number between 1 and 4.\n");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nEnter a valid number!\n");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double deposit = Double.valueOf(scanner.nextLine());

                double balance = bankingSystem.deposit(bankAccount, deposit);
                System.out.printf("New Balance: €%.2f\n", balance);
                continue;
            }

            if (choice == 2) {
                double balance;
                System.out.print("Enter withdraw amount: ");
                double deposit = Double.valueOf(scanner.nextLine());

                try {
                    balance = bankingSystem.withdraw(bankAccount, deposit);
                } catch (InsuficientFundsException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                System.out.printf("New Balance: €%.2f\n", balance);
                continue;
            }

            if (choice == 3) {
                System.out.println(bankAccount);
            }

            if (choice == 4) {
                System.out.println("To main menu\n");
                break;
            }
        }

    }

    public BankAccount accessAccount() {
        int accountNumber;
        int pin;
        BankAccount bankAccount;

        while (true) {
            System.out.print("Enter account number: ");

            try {
                accountNumber = Integer.valueOf(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("\nEnter a valid account number!\n");
                continue;
            }

            System.out.print("Enter pin number: ");
            try {
                pin = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nEnter a valid pin number!\n");
                continue;
            }

            bankAccount = bankingSystem.getAccount(accountNumber);

            try {
                if (bankAccount == null) {
                    throw new InvalidAccountNumberException("Invalid account number\n");
                }
            } catch (InvalidAccountNumberException e) {
                System.out.println(e.getMessage());
                continue;
            }

            try {
                if (pin != bankAccount.getPin()) {
                    throw new IncorrectPinException("Incorrect pin number\n");
                }
            } catch (IncorrectPinException e) {
                System.out.println(e.getMessage());
                continue;
            }
            return bankAccount;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount[] bankAccounts = new BankAccount[]{
                new BankAccount(111, 100.0, 1111),
                new BankAccount(222, 200.0, 2222),
                new BankAccount(333, 300.0, 3333),
        };

        BankingSystem bankingSystem = new BankingSystem(bankAccounts);

        new Main(scanner, bankingSystem);
    }

}
