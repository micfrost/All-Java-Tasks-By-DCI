package D82_Transaction2.src.main.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Transaction {

    // CREATE TRANSACTION
    public void createTransaction() {
        Connection connection = DBConnection.getConnection();
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            DataManagement.sqlCreateTable(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.closeConnection(connection);
        }
    }

    // INSERT TRANSACTION
    public void insertTransaction() {
        try (Connection connection = DBConnection.getConnection();
             Statement stmt = connection.createStatement()) {
            DataManagement.insertDataIntoTable(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
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
