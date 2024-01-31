package D82_Transaction2.src.main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String DB_URL = "jdbc:postgresql://localhost:5432/240131_DCI_Transactio2Test";
    private static String DB_USER = "postgres";
    private static String DB_PASSWORD = "postgres";

    // GET CONNECTION
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection (DB_URL, DB_USER,DB_PASSWORD);
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // CLOSE CONNECTION
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
