import java.util.ArrayList;
<<<<<<< HEAD:src/Java/Movies.java
//WORK IN PROGRESS
public class Movies extends Media {
=======

public class Movie extends Media {
>>>>>>> UI:src/Java/Movie.java
    String name;
    public String Movies;
   private int releaseYear;
    private int starRating;

    Movie(String title, ArrayList genres, float rating, int releaseYear, int ID){
        super(title, genres, rating, ID);
        this.releaseYear = releaseYear;
    }




<<<<<<< HEAD:src/Java/Movies.java
=======

    public String getName() {
        return name;
    }
>>>>>>> UI:src/Java/Movie.java

    public int getReleaseYear() {
        return releaseYear;
    }

<<<<<<< HEAD:src/Java/Movies.java

    public void play(){
        
=======
    public int getStarRating() {
        return starRating;
    }
    @Override
    public void play(String msg){
        System.out.println("*********************");
            System.out.println(msg);
>>>>>>> UI:src/Java/Movie.java
    }
}
