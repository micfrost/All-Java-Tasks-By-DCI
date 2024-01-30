package D80_Transactions.active_transaction;

import java.sql.*;

public class ActivetransactionMahmud {
    private static Connection connection;



    private static void updateQuery() throws SQLException {

//        Transaction Management


        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT " +
                     "COUNT(1) " +
                     "AS count " +
                     "FROM INFORMATION_SCHEMA.INNODB_TRX " +
                     "WHERE trx_mysql_thread_id = CONNECTION_ID()")) {

            //        Check if there is an active transaction
            if (resultSet.next() && resultSet.getInt("count") == 0) {

                // No active transaction, perform the update
                try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement("UPDATE EmployeeDetails SET empFirstName = ? WHERE EmpId = 6")) {

                    preparedStatement.setString(1, "Tronsoos"); // Set the new value
                    preparedStatement.executeUpdate();
                    System.out.println("Update completed successfully.");
                }
            } else {
                System.out.println("There is an active transaction. Skipping update.");
            }
        }
    }


    public static void main(String[] args) {

//        Connection Setup
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dciDB", "root", "password");

            updateQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}