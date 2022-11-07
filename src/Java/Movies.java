import java.util.ArrayList;

public class Movies extends Media {
    String name;
    public String Movies;
   private int releaseYear;
    private int starRating;

    Movies(String title, ArrayList genres, float rating, int releaseYear, int ID){
        super(title, genres, rating, ID);
        this.releaseYear = releaseYear;
    }

    static void categories(){

    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getStarRating() {
        return starRating;
    }
    public void play(){
        
    }
}
