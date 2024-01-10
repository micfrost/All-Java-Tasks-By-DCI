package D78_JDBC.src.jdbc;

import java.sql.*;

public class queries {

    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/article";
    private static final String user = "root";
    private static final String password = "password";

    public static void main(String[] args) throws SQLException {
        Connection myconnection = null;
        Statement myStatement = null;
        ResultSet myResultSet = null;


        try {
            //            1. Get a connection to a database

            myconnection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Database connection successful");

//         2. Create statement
            myStatement = myconnection.createStatement();

//            sql query to create a table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS userss (id int auto_increment primary key, name Varchar(50), age INT);";
            String insertQuery = "INSERT into userss (name, age) VALUES ('Peter' , 19)";
            String insertQuery1 = "INSERT into userss (name, age) VALUES ('Paul' , 22)";
            String updateQuery = "UPDATE userss SET name = 'Thomas' WHERE id = '3'";

            // Execute Queries

//            myStatement.execute(createTableQuery);
//            myStatement.execute(insertQuery);
//            myStatement.execute(insertQuery1);


//            update query
            int rowsAffected = myStatement.executeUpdate(updateQuery);

            if (rowsAffected > 0) {
                System.out.println("Data updated successfully");
            } else {
                System.out.println("No data was updated");
            }

            myResultSet = myStatement.executeQuery("select * from userss");

            while (myResultSet.next()) {
                System.out.println(myResultSet.getInt("id") + "\t"+
                        myResultSet.getString("name") + "\t" +
                                myResultSet.getInt("age"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // Close resources in the reverse order of their creation if they are open
            if (myResultSet != null) {
                myResultSet.close();
            }
            if (myStatement != null) {
                myStatement.close();
            }
            if (myconnection != null) {
                myconnection.close();
            }
        }
    }
}
