import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static void main(String[] args) {
        // This is the URL for your database
        String url = "jdbc:mysql://localhost:3306/portfolio_db";
        String user = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to the Database for SEC Course!");
        } catch (Exception e) {
            System.out.println("Connection failed. Check your database settings.");
        }
    }
}
