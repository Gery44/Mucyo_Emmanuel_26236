import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistent", "user", "pass");
        } catch (SQLException e) {
            System.out.println("SQLException caught: Error connecting to database.");
        }
    }
}
