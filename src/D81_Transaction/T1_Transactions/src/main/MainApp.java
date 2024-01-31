package D81_Transaction.T1_Transactions.src.main;

public class MainApp {

    public static void main(String[] args) {
        Transaction transaction = new Transaction();

        // Demonstrate creating a transaction
        transaction.createTransaction();

        // Demonstrate inserting data into the table within a transaction
        transaction.insertTransaction();
    }
}
