package D78_JDBC.src.jdbc_mysql;

import java.sql.*;
import java.util.Scanner;

public class PreperedStatement {
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/dciDB";
    private static final String user = "root";
    private static final String password = "ppp";

    public static void main(String[] args) throws SQLException {
        Connection myConnection = null;
        PreparedStatement myStatement = null;
        ResultSet myResultSet = null;
        Scanner scanner = null;

        try {
//            1. Get a connection to a database
            myConnection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Database connection successful");

            scanner = new Scanner(System.in);
            System.out.println("What age do you want to search?");
            int age = Integer.parseInt(scanner.nextLine());

//         2. Prepare statement to parameter statement
            myStatement = myConnection.prepareStatement("SELECT * FROM users where age = ?");

            myStatement.setInt(1, age);
            myResultSet = myStatement.executeQuery();

            while (myResultSet.next()) {
                System.out.println("age" + myResultSet.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources in the reverse order of their creation if they are open
            if (myResultSet != null) {
                myResultSet.close();
            }
            if (myStatement != null) {
                myStatement.close();
            }
            if (myConnection != null) {
                myConnection.close();
            }
        }
    }
}

