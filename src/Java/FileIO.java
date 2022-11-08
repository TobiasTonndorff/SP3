
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//VIRKER IKKE
public class FileIO {
    /*public Movies readMoviesFile(String field, String query) {
        File file = new File("SP3/src/Data/Movies.txt");
        ArrayList<String> movies = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            String[] header = input.nextLine().split(";");
            int index = 0;
            for(int i = 0; i < header.length; i++){
                if(header[i].equalsIgnoreCase(field)){
                    index = i;
                }

            }
            while(input.hasNextLine()){
                String movie = input.nextLine();
                String[] values = movie.split(";");
                if(values[index].equalsIgnoreCase(query)){
                    return movie(values);
                }
            }
        } catch (FileNotFoundException e) {
            movies = null;
        }
        return movies;

    }*/
    private Movies movie(String [] m) {
        Map map = media(m);
        int year = Integer.parseInt(m[2]);
        return new Movies((String) map.get("title"), (ArrayList) map.get("categories"), (Float) map.get("rating"), year, (Integer) map.get("ID"));
    }
    private Map media(String [] me){
        int ID = Integer.parseInt(me[0]);
        String title = me[1];
        ArrayList<String> categories = new ArrayList<>();
        String[] categoriesArr = me[3].split(",");
        categories.addAll(Arrays.asList(categoriesArr));
        float rating = Float.parseFloat(me[4].replace(",", "."));
        Map map = new HashMap<>();
        map.put("title", title);
        map.put("categories", categories);
        map.put("rating", rating);
        map.put("ID", ID);
        return map;
    }

    public ArrayList<String> readSeriesFile() {
        File file = new File("Data/Series.txt");
        ArrayList<String> Series = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            input.nextLine();
            while (input.hasNextLine()) ;
            Series.add(input.nextLine());

        } catch (FileNotFoundException e) {
            Series = null;
        }
        return Series;
    }

    public void writeUserFile(User u) {
        try {
            FileWriter writer = new FileWriter("Data/Users.txt");
            writer.write(u.getUserName() + ": " + u.getPassword() +":");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    public String readUserFile(String username, String password){
        File file = new File("Data/Users.txt");
        ArrayList<String> users = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                users.add(input.nextLine());
            }
            for (String u : users) {
                String[] values = u.split(";");
                if (Objects.equals(values[0], username) && Objects.equals(values[1], password)) {
                    return u;
                }
            }
        } catch (FileNotFoundException e) {
            users = null;
        }
        return"";

    }

}
