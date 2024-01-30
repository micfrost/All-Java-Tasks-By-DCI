package D78_JDBC.src.jdbc_postgresql.lister_Tables;

import java.sql.Connection;

public class TablesListerApp {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = PostgreqSqlConnector.getConnection();
            if(conn != null) {
                System.out.println("Connection created");
                System.out.println("Listing Tables.");
                System.out.println(PostgreqSqlConnector.listTables());
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