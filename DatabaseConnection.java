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
public class Main {
    public static void main(String[] args) {
        System.out.println("The Brain is waking up...");
        // This part will eventually take the name from your website
        String name = "Student Name"; 
        System.out.println("I caught the name: " + name);
    }
}
