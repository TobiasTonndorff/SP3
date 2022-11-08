import java.util.ArrayList;
//VIRKER IKKE
public class MenuNavigation {
    public FileIO fileIO = new FileIO();

    private TextMenu textMenu = new TextMenu();

    public ArrayList<Series> series = new ArrayList<>();
    public ArrayList<Movies> movies = new ArrayList<>();

    public User user;

    public void startScreen(){
        String result = textMenu.getUserInput("Welcome \n press 1 to login \n press 2 to create a accoutn");
        if(Integer.parseInt(result) == 1){
            loginScreen();
        }else{
            createUser();
        }
        System.out.println(user.getUserName());
    }

    public void loginScreen(){
        String username = textMenu.getUserInput("please enter your username");
        String password = textMenu.getUserInput("please enter your password");
        String result = fileIO.readUserFile(username, password);
        String[] arr = result.split(";");
        user = new User(arr[0],arr[1]);
    }



    public void logout(){
        String result = textMenu.getUserInput("You are about to logout \n press 1 to cancel \n press 2 to continue ");
        if(Integer.parseInt(result)== 1){
            user = null;

        }

    }

    public void createUser() {
        String username = textMenu.getUserInput("Please enter your username");
        String password = textMenu.getUserInput("Please enter your password");


        user = new User(username, password);
        fileIO.writeUserFile(user);
    }


}
