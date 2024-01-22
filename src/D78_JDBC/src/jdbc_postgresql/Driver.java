package D78_JDBC.src.jdbc_postgresql;

import java.sql.*;

public class Driver {
    // JDBC URL, username, and password of PostgreSQL server
    private static final String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "postgres";

    // JDBC variables for opening, closing, and managing a connection
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
            String query1 = "SELECT datname FROM pg_database";
            myResultSet = myStatement.executeQuery(query1);

//            4. process the result set
            System.out.println("List of Databases:");
            while (myResultSet.next()) {
                String dbName = myResultSet.getString("datname");
                System.out.println(dbName);

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
