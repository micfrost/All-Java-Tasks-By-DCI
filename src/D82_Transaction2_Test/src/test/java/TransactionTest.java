package D82_Transaction2_Test.src.test.java;


import D82_Transaction2_Test.src.main.java.DBConnection;
import D82_Transaction2_Test.src.main.java.Transaction;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
    @Test
    public void test_EX_1() {
        Transaction transaction = new Transaction();
        transaction.createTransaction();
        transaction.insertTransaction();
        int total = countRecords();
        Assertions.assertEquals(4, total);
//        Assertions.assertEquals(1, total);

    }

    private int countRecords() {
        int total = 0;
        try (Connection connection = DBConnection.getConnection(); Statement stmt = connection.createStatement()) {
            String sql = "SELECT COUNT(*) AS total FROM REGISTRATION ";
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
