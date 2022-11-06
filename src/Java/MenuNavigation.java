import java.util.ArrayList;

public class MenuNavigation {
    public FileIO fileIO = new FileIO();

    private TextMenu textMenu = new TextMenu();

    public ArrayList<Series> series = new ArrayList<>();
    public ArrayList<Movies> movies = new ArrayList<>();

    public User_2 user_2;



    public void logout(){
        String result = textMenu.getUserInput("You are about to logout \n press 1 to cancel \n press 2 to continue ");
        if(Integer.parseInt(result)== 1){
            user_2 = null;

        }
    }


}
