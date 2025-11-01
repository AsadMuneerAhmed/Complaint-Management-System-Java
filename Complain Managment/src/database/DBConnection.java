package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // change URL user/password if needed
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/complaint_management?serverTimezone=UTC",
                    "root",
                    "asad1234"  // put your MySQL password here if any
                );
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Other error: " + e.getMessage());
        }
        return con;
    }
}
