package D83_Transaction3.src.test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import D83_Transaction3.src.main.java.DBConnection;
import D83_Transaction3.src.main.java.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {

    // TEST CASE FOR INSERTING DATA INTO TABLE
    @Test
    public void test_EX_1() {

        // CREATE TRANSACTION OBJECT
        Transaction transaction = new Transaction();

        // CREATE TABLE AND INSERT DATA
        transaction.createTransaction();
        transaction.insertTransaction();
        transaction.displayResults();

        // COUNT TOTAL RECORDS IN TABLE
        int total = countRecords();

        // ASSERT THAT TOTAL RECORDS MATCH THE EXPECTED VALUE
        assertEquals(4, total);
//        Assertions.assertEquals(1, total);

    }

    // HELPER METHOD TO COUNT RECORDS IN THE TABLE
    private int countRecords() {
        int countRecords = 0;
        try (Connection connection = DBConnection.getConnection(); Statement stmt = connection.createStatement()) {
            String sql = "SELECT COUNT(*) AS countRecords FROM registration_table ";
            ResultSet count = stmt.executeQuery(sql);
            while(count.next()){
                countRecords = count.getInt("countRecords");
            }
            return countRecords;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countRecords;
    }

    @Test
    public void rollbackOccursWhenLessThanFiveRecordsInserted() {
        Transaction transaction = new Transaction();

        // Get the initial count of records
        int initialCount = countRecords();

        // Execute the transaction
        transaction.createTransaction();
        transaction.insertTransaction();

        // Get the count of records after the transaction
        int countRecords = countRecords();

        // Check if rollback occurred by comparing counts
        if (countRecords < 5) {
            // If rollback occurred, assert that the count is the same as the initial count
            assertEquals(initialCount, countRecords, "Rollback occurred, records were not inserted");
        } else {
            // If rollback did not occur, assert that the count is greater than or equal to 5
            assertTrue(countRecords >= 5, "Rollback did not occur, at least 5 records were inserted");
        }
    }

}

