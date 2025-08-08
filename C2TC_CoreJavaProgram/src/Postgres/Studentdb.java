package Postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdb {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "itsmeikiller@03";

        try {
            // Load PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL database!");

            // Create a statement and execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT id, name, department, salary FROM employees";
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String sname = rs.getString("sname");
                int age = rs.getInt("age");

                System.out.println(id + " | " + sname + " | " + age + " | ");
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}