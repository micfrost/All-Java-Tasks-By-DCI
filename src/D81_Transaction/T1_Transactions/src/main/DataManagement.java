package D81_Transaction.T1_Transactions.src.main;

import java.sql.SQLException;
import java.sql.Statement;

public class DataManagement {

    public static void sqlCreateTable(Statement statement) throws SQLException {
        dropTable(statement);
        String createBasketballTableQuery =
                "CREATE TABLE IF NOT EXISTS basketball_players ("
                + "id INT, "
                + "name VARCHAR(255), "
                + "team VARCHAR(255), "
                + "position VARCHAR(255), "
                + "points_per_game DOUBLE PRECISION, "
                + "rebounds_per_game DOUBLE PRECISION, "
                + "assists_per_game DOUBLE PRECISION)";

        statement.execute(createBasketballTableQuery);
    }

    public static void insertDataIntoTable(Statement statement) throws SQLException {
        String insertDataQuery = "INSERT INTO basketball_players " +
                "(id, name, team, position, points_per_game, rebounds_per_game, assists_per_game) " +
                "VALUES " +
                "(1, 'LeBron Jameski', 'Los Angeles Lakers', 'Forward', 25.4, 7.9, 7.8), " +
                "(2, 'Kevin Durantski', 'Brooklyn Nets', 'Forward', 26.9, 7.1, 5.6), " +
                "(3, 'Stephen Curry', 'Golden State Warriors', 'Guard', 27.7, 5.3, 5.8)";
        statement.execute(insertDataQuery);
    }

    private static void dropTable(Statement statement) throws SQLException {
        String dropTableQuery = "DROP TABLE IF EXISTS basketball_players";
        statement.execute(dropTableQuery);
    }
}