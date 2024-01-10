package D79_ConnectionPooling.src.main.java.org.example;
/*
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HikariCP_Demo {
    private static HikariDataSource dataSource = null;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/studentdb");
        config.setUsername("root");
        config.setPassword("password");

        config.addDataSourceProperty("minimumIdle", "5");
        config.addDataSourceProperty("maximumPoolSize", "25");

        dataSource = new HikariDataSource(config);
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from tblstudent");
            while (resultSet.next()) {
                System.out.print("studentId: " + resultSet.getInt("studentId"));
                System.out.print(" studentName: " + resultSet.getString("studentName"));
                System.out.print(" dob: " + resultSet.getDate("dob"));
                System.out.println(" address: " + resultSet.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
*/