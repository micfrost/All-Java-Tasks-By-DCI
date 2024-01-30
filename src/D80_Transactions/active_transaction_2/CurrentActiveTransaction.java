package D80_Transactions.active_transaction_2;

import java.sql.*;
public class CurrentActiveTransaction {
    private static final String url = "jdbc:mysql://localhost:3306/dciDB";
    private static final String user = "root";
    private static final String password = "password";
    private static Connection connection;
    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            updateQuery();
            System.out.println("Current Active Transaction : " + isCurrentActiveTransaction());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
    private static void updateQuery() throws SQLException {
        String sql = "INSERT into EmployeeDetails values (7, 'AlicUpdate', 'RobensonUpdate', 'IT NiceOne', 104)";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw e;
        }
    }
    private static boolean isCurrentActiveTransaction() throws SQLException {
        int transactionCount = 0;
        String sql = "SELECT \n" +
                "    COUNT(1) " +
                "AS count\n" +
                "FROM\n" +
                "    INFORMATION_SCHEMA.INNODB_TRX\n" +
                "WHERE\n" +
                "    trx_mysql_thread_id = CONNECTION_ID()";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            if (resultSet.next()) {
                transactionCount = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        return transactionCount > 0;
    }
}