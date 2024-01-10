package D79_ConnectionPooling.src.main.java.org.example;
/*
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class c3p0_Demo {

    static ComboPooledDataSource comboPooledDataSource = null;

    static {
        comboPooledDataSource = new ComboPooledDataSource();

        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/studentdb");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("password");

        comboPooledDataSource.setMinPoolSize(3);
        comboPooledDataSource.setMaxPoolSize(6);
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = comboPooledDataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM tblstudent");


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