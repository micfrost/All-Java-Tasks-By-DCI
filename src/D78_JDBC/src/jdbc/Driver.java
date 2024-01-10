package D78_JDBC.src.jdbc;

import java.sql.*;

public class Driver {
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/article";
    private static final String user = "root";
    private static final String password = "password";

    public static void main(String[] args) throws SQLException {
        Connection myConnection = null;
        Statement myStatement = null;
        ResultSet myResultSet = null;

        try {
//            1. Get a connection to a database

            myConnection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Database connection successful");

//         2. Create statement
            myStatement = myConnection.createStatement();

//            3. Execute a sql query
            myResultSet = myStatement.executeQuery("SELECT * FROM usertable");

//            4. process the result set
            while (myResultSet.next()) {
                System.out.println(
                        myResultSet.getString("id") + ", " +
                                myResultSet.getString("name") + ", " +
                                myResultSet.getString("city")
                );
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

