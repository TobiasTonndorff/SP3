import java.util.ArrayList;
// WORK IN PROGRESS
public class Series extends Media {

    private int startDate;
    private int endDate;
<<<<<<< HEAD
    private ArrayList<String> season;

    public Series(String title, ArrayList genres, float rating, int startDate, int endDate, ArrayList<String> season, int ID){
=======
    private ArrayList<Integer> seasons;

    private ArrayList<String> genres;

    public Series(String title, ArrayList<String> genres, float rating, int startDate, int endDate, ArrayList<Integer> seasons, int ID){
>>>>>>> UI
    super(title, genres, rating, ID);
    this.startDate = startDate;
    this.endDate = endDate;
    this.seasons = seasons;
    this.genres = genres;
    }

<<<<<<< HEAD

=======
    public ArrayList play(int s, int e){
        return null;
    }
>>>>>>> UI
    public String getYear() {
        return startDate + ":" + endDate;
    }
    public void play(){

    }

    @Override
    public void play(String msg) {
        System.out.println("*****************");
        System.out.println(msg);
    }
}






