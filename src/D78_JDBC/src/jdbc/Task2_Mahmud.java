package D78_JDBC.src.jdbc;


import java.sql.*;

public class Task2_Mahmud {
    public static void main(String[] args) {
        Connection conn = null;
        Statement myStmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/article", "root", "password");

            myStmt = conn.createStatement();

//            Method 1

            myStmt.execute("CREATE TABLE IF NOT EXISTS Employees (ID INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(50), Department VARCHAR(50), Salary DOUBLE)");


            // Method 2: executeUpdate() - Insert Record
            String insertQuery = "INSERT INTO Employees (Name, Department, Salary) VALUES ('Mahmoud', 'Software Engineer', 10000)";
            int rowsAffected = myStmt.executeUpdate(insertQuery);
            System.out.println(rowsAffected > 0 ? "Record inserted successfully!" : "Failed to insert record.");

            // Method 3: executeQuery() - Select and Display All Records
            ResultSet r = myStmt.executeQuery("SELECT * FROM Employees");
            System.out.printf("%-5s %-20s %-20s %-10s%n", "ID", "Name", "Department", "Salary");
            System.out.println("-------------------------------------------------------------");
            while (r.next()) {
                int id = r.getInt("ID");
                String name = r.getString("Name");
                String department = r.getString("Department");
                double salary = r.getDouble("Salary");
                System.out.printf("%-5d %-20s %-20s %-10.2f%n", id, name, department, salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}