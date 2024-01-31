package D82_Transaction2.src.main.java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataManagement {

    // CREATE TABLE SQL
    public static void sqlCreateTable(Statement statement) throws SQLException {
        dropTable(statement);
        String sql = "CREATE TABLE IF NOT EXISTS registration_table " +
                "(id INT , " +
                "name VARCHAR(255), " +
                "lastName VARCHAR(255), " +
                "age INT)";
        statement.executeUpdate(sql);
    }

    // INSERT DATA INTO TABLE SQL
    public static void insertDataIntoTable(Statement statement) throws SQLException {
        try {
            String sql = "INSERT INTO registration_table (id, name, lastName, age) VALUES "
                    + "(1, 'Johnski', 'Doe', 25), "
                    + "(2, 'Aliceski', 'Johnson', 30), "
                    + "(3, 'Bob', 'Smith', 28), "
                    + "(4, 'Eva', 'Green', 35)";
            statement.executeUpdate(sql);
        } catch (SQLException s) {
            s.printStackTrace();
        }
    }

    // DROP TABLE SQL
    private static void dropTable(Statement statement) throws SQLException {
        String sql = "DROP TABLE IF EXISTS registration_table";
        statement.executeUpdate(sql);
    }

    // GET DATA FROM TABLE
    public static ArrayList<Person> getDataFromTable(Statement statement) throws SQLException {
        String sql = "select id, name, lastName, age from registration_table";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Person> peopleList = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String first = rs.getString("name");
            String last = rs.getString("lastName");
            int age = rs.getInt("age");
            peopleList.add(new Person(id, first, last, age));
        }
        rs.close();
        return peopleList;
    }


}
