import java.util.Scanner;

public class LoginIo {

    Scanner input = new Scanner(System.in);

    String user, pass;


    LoginIo(){
        System.out.println("Enter your username: ");
        user = input.nextLine();

        System.out.println("enter your password: ");
        pass = input.nextLine();

        if(user.equals("Morten") && (pass.equals("Fede"))){
            System.out.println("Login succes");
        } else{
            System.out.println("Username or password incorrect");
        }
    }
}
