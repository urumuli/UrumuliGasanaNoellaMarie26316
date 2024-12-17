
    import java.sql.*;

    public class SQLExceptionExample {
        public static void triggerSQLException() {
            try {
                // Attempt to connect to a non-existent database
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
            } catch (SQLException e) {
                // Handle SQLException
                System.out.println("SQLException caught: " + e.getMessage());
            }
        }
    }

