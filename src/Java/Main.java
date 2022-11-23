import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Users","root","olle123");
            Statement st=con.createStatement();
            System.out.println("Enter Username");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        UserManager manager = UserManager.getInstance();

        manager.loadUsers();

        GUI loginpage = new GUI();
        loginpage.getClass();

    }
}