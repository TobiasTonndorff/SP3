import java.util.ArrayList;
// WORK IN PROGRESS
public class Series extends Media {

    private int startDate;
    private int endDate;
    private ArrayList<String> season;

    public Series(String title, ArrayList genres, float rating, int startDate, int endDate, ArrayList<String> season, int ID){
    super(title, genres, rating, ID);
    this.startDate = startDate;
    this.endDate = endDate;
    this.season = season;

    }


    public String getYear() {
        return startDate + ":" + endDate;
    }
}






