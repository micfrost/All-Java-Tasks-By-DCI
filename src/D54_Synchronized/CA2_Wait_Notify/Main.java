package D54_Synchronized.CA2_Wait_Notify;
class Account {

    int amount = 0;
    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing . . .");
        if (this.amount < amount) {
            System.out.println("Insufficient funds. Please deposit . . . ");
            System.out.println("- - - ");
            try {
//               wait() makes the execution of the whole method where the notify() is mentioned.
                wait();
            } catch (Exception e) {
                System.out.println("Oh no: " + e);
                System.out.println("- - - ");
            }
        } else {
        this.amount -= amount;
        System.out.println("withdrawing: " + amount);
        System.out.println("withdraw completed");
        System.out.println("Current account: "+ this.amount);
        System.out.println("- - - ");}
    }

    synchronized void deposit(int amount) {
        System.out.println("Depositng: " + amount);
        this.amount += amount;

        System.out.println("Deposit completed.");
        System.out.println("Current account: "+ this.amount);
        System.out.println("- - - ");
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Current account: "+ account.amount);
        System.out.println(" - - -");

//        the fourth example how to create a thread
        new Thread() {
            public void run() {
                account.withdraw(25000);
            }
        }.start();

        new Thread() {
            public void run() {
                account.deposit(6000);
            }
        }.start();
    }
}
