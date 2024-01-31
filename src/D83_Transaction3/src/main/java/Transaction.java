package D83_Transaction3.src.main.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Transaction {


    // CREATE TRANSACTION
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
            System.out.println("Commit: Create Table registration_table successful");

        } catch (SQLException e) {
            e.printStackTrace(); // Log or rethrow the exception
            try {
                if (connection != null) {
                    connection.rollback(); // Rollback the transaction in case of exception
                }
            } catch (SQLException rollbackException) {
                System.out.println("Rollback: Create Table registration_table failed");
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


            // Count the number of rows after insert
            int countRecords = DataManagement.countRecords(stmt);

          // Commit transaction
            if (countRecords < 5) {
                connection.rollback(); // Rollback the transaction if condition is not met
                System.out.println("Rollback: Insert into registration_table failed - too few records");

            } else {
                connection.commit();
                System.out.println("Commit: Insert into registration_table successful");
            }



        } catch (SQLException e) {
            e.printStackTrace(); // Log or rethrow the exception
            try {
                if (connection != null) {
                    connection.rollback(); // Rollback the transaction in case of exception
                }
            } catch (SQLException rollbackException) {
                System.out.println("Rollback: Insert into registration_table failed");
                rollbackException.printStackTrace(); // Log or handle the rollback exception
            }
        } finally {
            DBConnection.closeConnection(connection);
        }
    }



    // READ TRANSACTION
    public ArrayList<Person> readTransaction() {
        ArrayList<Person> people = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             Statement stmt = connection.createStatement()) {
            people = DataManagement.getDataFromTable(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return people;
    }

    // DISPLAY RESULTS
    public void displayResults() {
        Transaction transaction = new Transaction();
        ArrayList<Person> result = transaction.readTransaction();
        for (Person person : result) {
            System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
        }
    }
}
