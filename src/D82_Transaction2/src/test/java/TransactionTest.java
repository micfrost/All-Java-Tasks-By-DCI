package D82_Transaction2.src.test.java;


import D82_Transaction2.src.main.java.DBConnection;
import D82_Transaction2.src.main.java.Transaction;
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
        Assertions.assertEquals(4, total);
//        Assertions.assertEquals(1, total);

    }

    // HELPER METHOD TO COUNT RECORDS IN THE TABLE
    private int countRecords() {
        int total = 0;
        try (Connection connection = DBConnection.getConnection(); Statement stmt = connection.createStatement()) {
            String sql = "SELECT COUNT(*) AS total FROM registration_table ";
            ResultSet count = stmt.executeQuery(sql);
            while(count.next()){
                total = count.getInt("total");
            }
            return total;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }


}
