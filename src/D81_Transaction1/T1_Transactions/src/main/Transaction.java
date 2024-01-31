package D81_Transaction1.T1_Transactions.src.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {

    public void createTransaction() {
        Connection connection = null; // Declare the variable outside the try block

        try {
            connection = DBConnection.getConnection();
            Statement stmt = connection.createStatement();

            // Change auto-commit status
            connection.setAutoCommit(false);

            DataManagement.sqlCreateTable(stmt);
            // Add more operations as needed

            // Commit transaction if needed
            connection.commit();
            System.out.println("Commit Create Table basketball_players successful");

        } catch (SQLException e) {
            e.printStackTrace(); // Log or rethrow the exception
            try {
                if (connection != null) {
                    connection.rollback(); // Rollback the transaction in case of exception
                }
            } catch (SQLException rollbackException) {
                System.out.println("Rollback: Create Table basketball_players failed");
                rollbackException.printStackTrace(); // Log or handle the rollback exception
            }
        } finally {
            DBConnection.closeConnection(connection);
        }
    }

    public void insertTransaction() {
        Connection connection = null; // Declare the variable outside the try block

        try {
            connection = DBConnection.getConnection();
            Statement stmt = connection.createStatement();

            // Change auto-commit status
            connection.setAutoCommit(false);

            DataManagement.insertDataIntoTable(stmt);
            // Add more operations as needed

            // Commit transaction if needed
            connection.commit();
            System.out.println("Commit Insert into basketball_players successful");

        } catch (SQLException e) {
            e.printStackTrace(); // Log or rethrow the exception
            try {
                if (connection != null) {
                    connection.rollback(); // Rollback the transaction in case of exception
                }
            } catch (SQLException rollbackException) {
                System.out.println("Rollback: Insert into basketball_players failed");
                rollbackException.printStackTrace(); // Log or handle the rollback exception
            }
        } finally {
            DBConnection.closeConnection(connection);
        }
    }
}