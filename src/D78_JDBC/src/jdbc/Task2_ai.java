package D78_JDBC.src.jdbc;

import java.sql.*;

public class Task2_ai {

    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/InterviewDB";
    private static final String user = "root";
    private static final String password = "your_password";

    public static void main(String[] args) {
        try {
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Database connection successful");

            // Execute Method 1: Insert a new employee record
            executeInsertStatement(connection, "John Doe", "IT", 50000.0);

            // Execute Method 2: Retrieve and display all employee records
            executeQueryStatement(connection);

            // Execute Method 3: Update an employee's salary
            executeUpdateStatement(connection, 1, 55000.0); // Assuming the ID of the employee to update is 1

            // Closing the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method 1: execute() - Insert a new employee record
    private static void executeInsertStatement(Connection connection, String name, String department, double salary) throws SQLException {
        String insertQuery = "INSERT INTO Employees (Name, Department, Salary) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, department);
            preparedStatement.setDouble(3, salary);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("New employee record inserted successfully.");
            } else {
                System.out.println("Failed to insert employee record.");
            }
        }
    }

    // Method 2: executeQuery() - Retrieve and display all employee records
    private static void executeQueryStatement(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM Employees";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String department = resultSet.getString("Department");
                double salary = resultSet.getDouble("Salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
            }
        }
    }

    // Method 3: executeUpdate() - Update an employee's salary based on their ID
    private static void executeUpdateStatement(Connection connection, int id, double newSalary) throws SQLException {
        String updateQuery = "UPDATE Employees SET Salary = ? WHERE ID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setDouble(1, newSalary);
            preparedStatement.setInt(2, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee salary updated successfully.");
            } else {
                System.out.println("Failed to update employee salary.");
            }
        }
    }
}
