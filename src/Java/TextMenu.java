
import java.util.Scanner;

public class TextMenu {
    static Scanner scan = new Scanner(System.in);

    public String getUserInput(String msg){
        System.out.println(msg);
        String input = scan.nextLine();
        return input;
    }
}
