import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    public ArrayList<String> readMoviesFile(){
        File file = new File("Data/Movies.txt");
        ArrayList<String> movies = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            input.nextLine();
            while (input.hasNextLine()) ;
            movies.add(input.nextLine());
        }catch (FileNotFoundException e) {
            movies = null;
        }
        return movies;

    }

    public ArrayList<String> readSeriesFile(){
        File file = new File("Data/Series.txt");
        ArrayList<String> Series = new ArrayList<>();
        try{
        Scanner input = new Scanner(file);
        input.nextLine();
        while (input.hasNextLine());
        Series.add(input.nextLine());

        }catch (FileNotFoundException e){
            Series = null;
        }
        return Series;
    }
}
