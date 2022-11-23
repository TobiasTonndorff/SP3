import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.sql.*;



public class TestJDBCConnection {
    @Test
    public void  database(){
        Connection connection;

        String url = "jdbc:mysql://localhost/sp3?" + "autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "olle123";


        try{
            connection = DriverManager.getConnection(url, username, password);
            assertEquals(true, connection.isValid(1));
            connection.close();
            assertEquals(false, connection.isValid(1));
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("jeg virker nu langt om længe");

    }
}