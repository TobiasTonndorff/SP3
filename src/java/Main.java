import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        UserManager manager = UserManager.getInstance();

        manager.loadUsers();

        GUI loginpage = new GUI();
        loginpage.getClass();

    }
}