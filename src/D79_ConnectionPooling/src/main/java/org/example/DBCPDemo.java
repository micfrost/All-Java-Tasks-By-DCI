package D79_ConnectionPooling.src.main.java.org.example;
/*
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCPDemo {
    //    creating instance of basic datasource
    public static BasicDataSource dataSource = null;

    static {
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/studentdb?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

//    specify minimum number of idle connections
        // Set other properties for the connection pool
        dataSource.setMinIdle(5);  // Minimum number of idle connections
        dataSource.setMaxIdle(10); // Maximum number of idle connections
        dataSource.setMaxTotal(100); // Maximum number of total connections
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            // Obtain a connection from the pool
            // Use the connection...
            // Perform database operations...
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM tblstudent");

            // Process the ResultSet...
            // Example: Print data from ResultSet
            while (resultSet.next()) {
                System.out.print("studentId: "+resultSet.getInt("studentId"));
                System.out.print("studentName: "+resultSet.getString("studentName"));
                System.out.print("dob: "+resultSet.getDate("dob"));
                System.out.println("address: "+resultSet.getString("address"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
            statement.close();
            resultSet.close();
        }
    }
}
*/