/*
Database programming with sqlite3
*/
import java.sql.*;
import java.util.Scanner;


public class intro {
    private Connection conn;

    public static void main(String[] args) {    
        try {
            intro db = new intro();
            db.connect("test.db");
            db.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    // Initialize database connection
    public void connect(String dbPath) throws SQLException {
        String url = "jdbc:sqlite:" + dbPath;
        conn = DriverManager.getConnection(url);
    }


    // Close database connection
    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }


    // Execute query and return ResultSet
    public ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(query);
    }


    // Execute update query (insert, update, delete)
    public int executeUpdate(String query) throws SQLException {
        Statement stmt = conn.createStatement();
        return stmt.executeUpdate(query);
    }


    // Create a new table
    public void createTable(String tableName, String[] columns) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS " + tableName + " (" + 
                      String.join(",", columns) + ")";
        executeUpdate(query);
    }


    // Insert data into table using prepared statement
    public void insertData(String tableName, Object[] values) throws SQLException {
        String placeholders = String.join(",", java.util.Collections.nCopies(values.length, "?"));
        PreparedStatement pstmt = conn.prepareStatement(
            "INSERT INTO " + tableName + " VALUES (" + placeholders + ")"

        );

        for(int i = 0; i < values.length; i++) {
            pstmt.setObject(i + 1, values[i]);
        }

        pstmt.executeUpdate();
    }
}
