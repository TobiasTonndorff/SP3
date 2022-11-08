import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Data {
    public ArrayList<Movies> getMoviesInCategory( String category) {

        ArrayList<Movies> movies = new ArrayList<>();
        Scanner scan = null;
        File fr = new File("../../Data/Movies.txt");
        try {
            scan = new Scanner(fr);


        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }
        if (scan != null) {
            while (scan.hasNextLine()) {
                String[] seperatedValues = scan.nextLine().split(";");
                String[] seperatedCategories = seperatedValues[2].split(",");
                for (int i = 0; i < seperatedCategories.length; i++) {
                    if (Objects.equals(seperatedCategories[i], category)) {
                        ArrayList<String> categories = (ArrayList<String>) Arrays.asList(seperatedCategories);
                        Movies movie = new Movies(seperatedValues[0],categories , Float.parseFloat(seperatedValues[3]), Integer.parseInt(seperatedValues[1]), 1);
                        movies.add(movie);

                    }

                }

            }

        }
        return movies;
    }


}
