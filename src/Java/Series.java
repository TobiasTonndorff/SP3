import java.util.ArrayList;

public class Series extends Media {

    private int startDate;
    private int endDate;
    private ArrayList[][] season = new ArrayList[0][0];

    public Series(String title, ArrayList genres, float rating, int startDate, int endDate, ArrayList[][] season, int ID){
    super(title, genres, rating, ID);
    this.startDate = startDate;
    this.endDate = endDate;
    this.season = season;

    }

    public ArrayList play(int s, int e){
        return season[s][e];
    }
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






