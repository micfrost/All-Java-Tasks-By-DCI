package D78_JDBC.src.jdbc_postgresql.lister_Databases;

import java.sql.Connection;

public class DatabaseListerApp {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = PostgreqSqlConnector.getConnection();
            if(conn != null) {
                System.out.println("Connection created");
                System.out.println("Listing Databases.");
                System.out.println(PostgreqSqlConnector.listDatabases());
            } else {
                System.out.println("Connection NOT created");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            PostgreqSqlConnector.close(conn);
        }
    }
}