import java.util.ArrayList;

public class User_2 {

    private int age;
    private String username;
    private String password;
    private static int ID;

    private ArrayList<Movies> watchedMovies = new ArrayList<>();
    private ArrayList<Movies> savedMovies = new ArrayList<>();

    public User_2(String username, String password, int age){
        this.username = username;
        this.password = password;
        this.age = age;
    }
    public void setWatchedMovies(Movies watched){
        watchedMovies.add(watched);
    }
    public void setSavedMovies(Movies saved) {
        savedMovies.add(saved);
    }
    public ArrayList<Movies> getWatchedMovies(){
        return watchedMovies;
    }
    public ArrayList<Movies> getSavedMovies(){
        return savedMovies;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static int getID() {
        return ID;
    }
}
