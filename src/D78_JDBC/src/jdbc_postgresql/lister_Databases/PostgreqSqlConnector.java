package D78_JDBC.src.jdbc_postgresql.lister_Databases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PostgreqSqlConnector {
    private static String _POSTGRESQL_DRIVER = "org.postgresql.Driver";
    private static String _URL = "jdbc:postgresql://localhost:5432/";
    private static String _UID = "postgres";
    private static String _PWD = "postgres";
    private static String _DBNAME = "postgres";
    private static Connection _conn = null;


    //            1. Get a connection to a database
    public static Connection getConnection() {
        return getConnection(_DBNAME);
    }

    public static Connection getConnection(String dbName) {
        try {
            if (_conn == null || _conn.isClosed()) {
                Class.forName(_POSTGRESQL_DRIVER);
                String url = (_URL + dbName );
                _conn = DriverManager.getConnection(url, _UID, _PWD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return _conn;
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
    public static List<String> listDatabases() {
        String query = "SELECT datname FROM pg_database";
        List<String> databases = new ArrayList<String>();
        Statement stmt = null;
        try {
            stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String dbName = rs.getString(1);
                databases.add(dbName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
        return databases;
    }
}