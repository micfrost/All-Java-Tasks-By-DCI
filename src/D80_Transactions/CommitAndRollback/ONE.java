package D80_Transactions.CommitAndRollback;

import java.sql.*;

public class ONE {
    private static final String url = "jdbc:mysql://localhost:3306/dciDB";
    private static final String user = "root";
    private static final String password = "password";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            // change auto commit status
            connection.setAutoCommit(false);

            // execute update query
            updateQuery(connection);


            // commit the transaction
            connection.commit();
            System.out.printf("commit successful");

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                // rollback the transaction if an exception occurs
                if (connection != null) {
                    connection.rollback();
                    System.out.println("Rolling back");
                }
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException closeException) {
                closeException.printStackTrace();
            }
        }
    }

    private static void updateQuery(Connection connection) throws SQLException {
        String sql = "INSERT into EmployeeDetails values (6, 'alice', 'Robenson', 'IT NiceOne', 104)";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        }
    }
}



