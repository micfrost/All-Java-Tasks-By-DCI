package D79_ConnectionPooling.src.main.java.org.example;
/*

import org.apache.commons.dbcp2.*;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBCPDemo2 {
    public static DataSource dataSource = null;

    static {
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "password");

        ConnectionFactory connectionFactory =
                new DriverManagerConnectionFactory("jdbc:mysql://localhost:3306/studentdb", properties);

        PoolableConnectionFactory poolableConnectionFactory =
                new PoolableConnectionFactory(connectionFactory, null);
        GenericObjectPoolConfig<PoolableConnection> poolConfig = new GenericObjectPoolConfig<>();

        poolConfig.setMinIdle(5);    // Minimum number of idle connections
        poolConfig.setMaxIdle(10);   // Maximum number of idle connections
        poolConfig.setMaxTotal(100); // Maximum number of total connections

        ObjectPool<PoolableConnection> connectionPool= new GenericObjectPool<>(poolableConnectionFactory,poolConfig);
        poolableConnectionFactory.setPool(connectionPool);

        dataSource = new PoolingDataSource<>(connectionPool);
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
                System.out.print("studentId: " + resultSet.getInt("studentId"));
                System.out.print(" studentName: " + resultSet.getString("studentName"));
                System.out.print(" dob: " + resultSet.getDate("dob"));
                System.out.println(" address: " + resultSet.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}*/