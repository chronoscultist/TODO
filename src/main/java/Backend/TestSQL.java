package Backend;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestSQL {
    private static final String DB_URL = "jdbc:postgresql://localhost:1337/postgres";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "deadhead11";
    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        String query = "SELECT username, password FROM public.\"Users\"";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");

            // Do something with the username and password data
            System.out.println(username + " " + password);
        }

        // Close the result set, statement, and connection when finished.
        rs.close();
        stmt.close();
        conn.close();
    }
}