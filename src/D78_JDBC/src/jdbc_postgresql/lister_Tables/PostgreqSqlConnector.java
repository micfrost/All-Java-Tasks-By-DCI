package D78_JDBC.src.jdbc_postgresql.lister_Tables;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PostgreqSqlConnector {
//    private static String _POSTGRESQL_DRIVER = "org.postgresql.Driver";
    private static String _URL = "jdbc:postgresql://localhost:5432/";
    private static String _UID = "postgres";
    private static String _PWD = "postgres";
    private static String _DBNAME = "240130_dci_Task1";
    private static Connection myConnection = null;


    //            1. Get a connection to a database
    public static Connection getConnection() {
        return getConnection(_DBNAME);
    }

    public static Connection getConnection(String dbName) {
        try {
            if (myConnection == null || myConnection.isClosed()) {
//                Class.forName(_POSTGRESQL_DRIVER);
                String url = (_URL + dbName );
                myConnection = DriverManager.getConnection(url, _UID, _PWD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myConnection;
    }
    public static boolean close(AutoCloseable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

//            2. Create statement
//            3. Execute a sql query
//            4. process the result set
    public static List<String> listTables() {
        String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'public'";
        List<String> tables = new ArrayList<String>();
        Statement stmt = null;
        try {
            stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String tableName = rs.getString(1);
                tables.add(tableName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
        return tables;
    }
}