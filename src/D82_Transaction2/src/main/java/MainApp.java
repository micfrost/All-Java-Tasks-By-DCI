package D82_Transaction2.src.main.java;

public class MainApp {

    public static void main(String[] args) {
        Transaction transaction = new Transaction();

        // Demonstrate creating a transaction
        transaction.createTransaction();

        // Demonstrate inserting data into the table within a transaction
        transaction.insertTransaction();

        transaction.displayResults();
    }
}
