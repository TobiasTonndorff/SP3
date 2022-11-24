import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    Data data = new Data();
    int userInput;

    public int getUserInput(String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public void mainInterface() {


        System.out.println("*********************MainMenu**************************");
        System.out.println("========================================================");
        System.out.println("You have these following options:");
        System.out.println("1. MovieMenu:");
        System.out.println("2. SeriesMenu:");
        System.out.println("3. Your favorites:");
        System.out.println("4. Exit:");

        userInput = getUserInput("Userinput: ");

        switch (userInput) {
            case 1 -> movieMenu();
            //case 2 -> seriesMenu();
            case 3 -> playMenu();
            case 4 -> System.exit(0);
            default -> System.out.println("Not a valid option");

        }


    }


    public void movieMenu() {
        System.out.println("*********************MovieMenu**************************");
        System.out.println("========================================================");
        System.out.println("You have these following options:");
        System.out.println("1. View categories");
        System.out.println("2. View all recently watched movies");
        System.out.println("3. View all saved movies");
        System.out.println("4. Back to MainMenu");
        userInput = getUserInput("User input: ");

        switch (userInput) {
            case 1 -> categoryMenu();
            //case 2 -> //En klasse skal have en funktion, der ordner det her.
           // case 3 -> //En klasse skal have en funktion, der ordner det her.
            case 4 -> mainInterface();
            default -> System.out.println("Not a valid option");
        }

    }



    public void categoryMenu() {
        System.out.println("*********************CategoryMenu**************************");
        System.out.println("========================================================");
        System.out.println("You have these following options:");
        System.out.println("1.View all Drama movies ");
        System.out.println("2.View all Thriller movies");
        System.out.println("3.View all Family movies");
        System.out.println("4.View all Crime movies");
        System.out.println("5.View all Adventure movies");
        System.out.println("6.View all Mystery movies");
        System.out.println("7.View all Sci-fi movies");
        System.out.println("8.View all War movies");
        System.out.println("9.View all Fantasy movies");
        System.out.println("10.View all Romance movies");
        System.out.println("11.View all Comedy movies");
        System.out.println("12.View all Musical movies");
        System.out.println("13. View all Action movies");
        System.out.println("14.Back to MovieMenu");

        userInput = getUserInput("Userinput: ");

        switch (userInput){
            case 1 -> movies(data.getMoviesInCategory("Drama"));
            case 2 -> movies(data.getMoviesInCategory("Thriller"));
            case 3 -> movies(data.getMoviesInCategory("Family"));
            case 4 -> movies(data.getMoviesInCategory("Crime"));
            case 5 -> movies(data.getMoviesInCategory("Adventure"));
            case 6 -> movies(data.getMoviesInCategory("Mystery"));
            case 7 -> movies(data.getMoviesInCategory("Sci-fi"));
            case 8 -> movies(data.getMoviesInCategory("War"));
            case 9 -> movies(data.getMoviesInCategory("Fantasy"));
            case 10 ->movies(data.getMoviesInCategory("Romance"));
            case 11-> movies(data.getMoviesInCategory("Comedy"));
            case 12-> movies(data.getMoviesInCategory("Musical"));
            case 13-> movies(data.getMoviesInCategory("Action"));
            case 14-> movieMenu();


        }

    }

        public void movies(ArrayList<Movie> movies) {
            for (int i = 0; i < movies.size(); i++) {
                System.out.println(i + ". " + movies.get(i).getTitle());

            }
           selectMovieMenu(movies);

        }

        public void selectMovieMenu(ArrayList<Movie> movies){
            MediaManager mM = MediaManager.getInstance();
                userInput = getUserInput("Select a movie");

                    switch (userInput) {
                        case 0 -> mM.setCurrentMedia(movies.get(0));
                        case 1 -> mM.setCurrentMedia(movies.get(1));
                        case 2 -> mM.setCurrentMedia(movies.get(2));
                        case 3 -> mM.setCurrentMedia(movies.get(3));
                        case 4 -> mM.setCurrentMedia(movies.get(4));
                        case 5 -> mM.setCurrentMedia(movies.get(5));
                        case 6 -> mM.setCurrentMedia(movies.get(6));
                        case 7 -> mM.setCurrentMedia(movies.get(7));
                        case 8 -> mM.setCurrentMedia(movies.get(8));
                        case 9 -> mM.setCurrentMedia(movies.get(9));
                        case 10 -> mM.setCurrentMedia(movies.get(10));
                        case 11 -> mM.setCurrentMedia(movies.get(11));
                        case 12 -> mM.setCurrentMedia(movies.get(12));
                        case 13 -> mM.setCurrentMedia(movies.get(13));
                        case 14 -> mM.setCurrentMedia(movies.get(14));
                        case 15 -> mM.setCurrentMedia(movies.get(15));
                        case 16 -> mM.setCurrentMedia(movies.get(16));
                        case 17 -> mM.setCurrentMedia(movies.get(17));
                        case 18 -> mM.setCurrentMedia(movies.get(18));
                        case 19 -> mM.setCurrentMedia(movies.get(19));
                        case 20 -> mM.setCurrentMedia(movies.get(20));
                        case 21 -> mM.setCurrentMedia(movies.get(21));
                        case 22 -> mM.setCurrentMedia(movies.get(22));
                        case 23 -> mM.setCurrentMedia(movies.get(23));
                        case 24 -> mM.setCurrentMedia(movies.get(24));
                        case 25 -> mM.setCurrentMedia(movies.get(25));
                        case 26 -> mM.setCurrentMedia(movies.get(26));
                        case 27 -> mM.setCurrentMedia(movies.get(27));
                        case 28 -> mM.setCurrentMedia(movies.get(28));
                        case 29 -> mM.setCurrentMedia(movies.get(29));
                        case 30 -> mM.setCurrentMedia(movies.get(30));
                        case 31 -> mM.setCurrentMedia(movies.get(31));
                        case 32 -> mM.setCurrentMedia(movies.get(32));
                        case 33 -> mM.setCurrentMedia(movies.get(33));
                        case 34 -> mM.setCurrentMedia(movies.get(34));
                        case 35 -> mM.setCurrentMedia(movies.get(35));
                        case 36 -> mM.setCurrentMedia(movies.get(36));
                        case 37 -> mM.setCurrentMedia(movies.get(37));
                        case 38 -> mM.setCurrentMedia(movies.get(38));
                        case 39 -> mM.setCurrentMedia(movies.get(39));
                        case 40 -> mM.setCurrentMedia(movies.get(40));
                        case 41 -> mM.setCurrentMedia(movies.get(41));
                        case 42 -> mM.setCurrentMedia(movies.get(42));
                        case 43 -> mM.setCurrentMedia(movies.get(43));
                        case 44 -> mM.setCurrentMedia(movies.get(44));
                        case 45 -> mM.setCurrentMedia(movies.get(45));
                        case 46 -> mM.setCurrentMedia(movies.get(46));
                        case 47 -> mM.setCurrentMedia(movies.get(47));
                        case 48 -> mM.setCurrentMedia(movies.get(48));
                        case 49 -> mM.setCurrentMedia(movies.get(49));
                        case 50 -> mM.setCurrentMedia(movies.get(50));
                        case 51 -> mM.setCurrentMedia(movies.get(51));
                        case 52 -> mM.setCurrentMedia(movies.get(52));
                        case 53 -> mM.setCurrentMedia(movies.get(53));
                        case 54 -> mM.setCurrentMedia(movies.get(54));
                        case 55 -> mM.setCurrentMedia(movies.get(55));
                        case 56 -> mM.setCurrentMedia(movies.get(56));
                        case 57 -> mM.setCurrentMedia(movies.get(57));
                        case 58 -> mM.setCurrentMedia(movies.get(58));
                        case 59 -> mM.setCurrentMedia(movies.get(59));
                        case 60 -> mM.setCurrentMedia(movies.get(60));
                        case 61 -> mM.setCurrentMedia(movies.get(61));
                        case 62 -> mM.setCurrentMedia(movies.get(62));
                        case 63 -> mM.setCurrentMedia(movies.get(63));
                        case 64 -> mM.setCurrentMedia(movies.get(64));
                        case 65 -> mM.setCurrentMedia(movies.get(65));
                        case 66 -> mM.setCurrentMedia(movies.get(66));
                        case 67 -> mM.setCurrentMedia(movies.get(67));
                        case 68 -> mM.setCurrentMedia(movies.get(68));
                        case 69 -> mM.setCurrentMedia(movies.get(69));
                        case 70 -> mM.setCurrentMedia(movies.get(70));
                        case 71 -> mM.setCurrentMedia(movies.get(71));
                        case 72 -> mM.setCurrentMedia(movies.get(72));
                        case 73 -> mM.setCurrentMedia(movies.get(73));
                        case 74 -> mM.setCurrentMedia(movies.get(74));
                        case 75 -> mM.setCurrentMedia(movies.get(75));
                        case 76 -> mM.setCurrentMedia(movies.get(76));
                        case 77 -> mM.setCurrentMedia(movies.get(77));
                        case 78 -> mM.setCurrentMedia(movies.get(78));
                        case 79 -> mM.setCurrentMedia(movies.get(79));
                        case 80 -> mM.setCurrentMedia(movies.get(80));
                        case 81 -> mM.setCurrentMedia(movies.get(81));
                        case 82 -> mM.setCurrentMedia(movies.get(82));
                        case 83 -> mM.setCurrentMedia(movies.get(83));
                        case 84 -> mM.setCurrentMedia(movies.get(84));
                        case 85 -> mM.setCurrentMedia(movies.get(85));
                        case 86 -> mM.setCurrentMedia(movies.get(86));
                        case 87 -> mM.setCurrentMedia(movies.get(87));
                        case 88 -> mM.setCurrentMedia(movies.get(88));
                        case 89 -> mM.setCurrentMedia(movies.get(89));
                        case 90 -> mM.setCurrentMedia(movies.get(90));
                        case 91 -> mM.setCurrentMedia(movies.get(91));
                        case 92 -> mM.setCurrentMedia(movies.get(92));
                        case 93 -> mM.setCurrentMedia(movies.get(93));
                        case 94 -> mM.setCurrentMedia(movies.get(94));
                        case 95 -> mM.setCurrentMedia(movies.get(95));
                        case 96 -> mM.setCurrentMedia(movies.get(96));
                        case 97 -> mM.setCurrentMedia(movies.get(97));
                        case 98 -> mM.setCurrentMedia(movies.get(98));
                        case 99 -> mM.setCurrentMedia(movies.get(99));
                    }

                    playMenu();
        }

    public void playMenu() {
        MediaManager mM = MediaManager.getInstance();

        System.out.println("*********************MovieMenu**************************");
        System.out.println("========================================================");
        System.out.println("You have these following options:");
        System.out.println("1. play movie");
        System.out.println("4. Back to MainMenu");
        userInput = getUserInput("User input: ");

        switch (userInput){
            case 1 -> System.out.println("playing "+ mM.getCurrentMedia().getTitle());


            case 4 -> mainInterface();

        }

    }
    }


