import java.util.ArrayList;
//WORK IN PROGRESS
public class Movies extends Media {
    String name;
    public String Movies;
   private int releaseYear;
    private int starRating;

    Movies(String title, ArrayList genres, float rating, int releaseYear, int ID){
        super(title, genres, rating, ID);
        this.releaseYear = releaseYear;
    }





    public int getReleaseYear() {
        return releaseYear;
    }


    public void play(){
        
    }
}
