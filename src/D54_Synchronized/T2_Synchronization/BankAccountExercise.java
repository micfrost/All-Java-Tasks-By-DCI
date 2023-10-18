package D54_Synchronized.T2_Synchronization;

class BankAccount {
    private double accountBalance;

    public double getAccountBalance() {
        return accountBalance;
    }

    synchronized public void deposit(double amount) {
        accountBalance = accountBalance + amount;
        System.out.println("Inside a Math Method, \tBalance after deposit: " + accountBalance);
    }

    synchronized public void withdraw(double amount) {
            accountBalance = accountBalance - amount;
            System.out.println("Inside a Math Method, \tBalance after withdraw: " + accountBalance);

    }
}

class Depositor extends Thread {
    private BankAccount bankAccount;

    public Depositor(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            double amount = 100;
            bankAccount.deposit(amount);
            System.out.println("Inside a Print Method, \tDeposit No.: " + i + ": " + amount + "€." + "\t Balance: " + bankAccount.getAccountBalance());
        }
    }
}

class Withdrawal extends Thread {
    private BankAccount bankAccount;

    public Withdrawal(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            double amount = 50;
//            if (bankAccount.getAccountBalance() < amount) {
//                System.out.println("Account balance insufficient.");
//            } else {
            bankAccount.withdraw(amount);
            System.out.println("Inside a Print Method, \tWithdraw No.: " + i + ": " + amount + "€." + "\t Balance: " + bankAccount.getAccountBalance());
        }
    }
}
//}

public class BankAccountExercise {
    public static void main(String[] args) {
        BankAccount bankAccountMy = new BankAccount();
        Depositor depositor1 = new Depositor(bankAccountMy);
        Withdrawal withdrawal1 = new Withdrawal(bankAccountMy);
        depositor1.start();
        withdrawal1.start();

//        Secure that main Thread is going after Threads
        try {
            depositor1.join();
            withdrawal1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("- - -");
        System.out.println("Final Balance: " + bankAccountMy.getAccountBalance());
    }
}
