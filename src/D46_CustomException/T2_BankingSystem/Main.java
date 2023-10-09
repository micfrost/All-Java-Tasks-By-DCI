package D46_CustomException.T2_BankingSystem;

public class Main {

    public static void main(String[] args) throws InsufficientFundsException {
        System.out.println();
        System.out.println("Banking System");
        System.out.println(
                "In this Java exercise, you will practice handling multiple exceptions in a simple banking system. You will create a program that simulates banking transactions and handles exceptions related to insufficient funds, invalid account numbers, and incorrect PINs.");
        System.out.println();

        System.out.println("e2" + 2 + 2);

        //      Initialize the array with at least three accounts.
        BankAccount bankAccount0 = new BankAccount(00000000, 0000, 0000);
        BankAccount bankAccount1 = new BankAccount(10001000, 1000, 1000);
        BankAccount bankAccount2 = new BankAccount(20002000, 2000, 2000);
        BankAccount bankAccount3 = new BankAccount(30003000, 3000, 3000);

        //      Create an array of "BankAccount" objects to represent customer accounts.
        BankAccount[] bankAccounts = {bankAccount0, bankAccount1, bankAccount2, bankAccount3};

        //      Withdraw money from an account.
        try {
            System.out.println("1");
            bankAccounts[1].withdraw(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //      Deposit money into an account.
        System.out.println("2");
        try {
            bankAccounts[1].deposit(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //      Attempt to access an account with an invalid account number.
        System.out.println("3");
        System.out.println("Attempt to access an account with an account number.");
        try {
            int accountToAccess = 20001000;
            boolean isAccessWithAccountNo = false;
            for (BankAccount element : bankAccounts) {
                if (accountToAccess == element.getAccountNumber()) {
                    System.out.println(element);
                    isAccessWithAccountNo = true;
                }
            }
            if (!isAccessWithAccountNo) {
                throw new IllegalArgumentException("Oh no: Account number not correct\n");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //      Attempt to withdraw more money than is available in an account (insufficient funds).
        System.out.println("4");
        System.out.println(
                "Attempt to withdraw more money than is available in an account (insufficient funds).");
        try {
            bankAccounts[0].withdraw(10000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //      Attempt to access an account with an incorrect PIN.
        System.out.println("5");
        System.out.println("Attempt to access an account with a PIN.");
        try {

            int accountNoToAccessWithPin = 10001000;
            int pinToAccess = 9000;
            boolean isAccessWithPin = false;
            for (BankAccount element : bankAccounts) {
                if ((accountNoToAccessWithPin == element.getAccountNumber())
                        && (pinToAccess == element.getPin())) {
                    System.out.println(element);
                    isAccessWithPin = true;
                }
            }
            if (!isAccessWithPin) {
                throw new InvalidPINException("Oh no: Account number and/or pin not correct\n");
            }
        } catch (InvalidPINException e) {
            System.out.println(e.getMessage());
        }
    }
}
