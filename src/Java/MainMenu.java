
import java.util.Scanner;

public class MainMenu {
    //Felter i hovedmenuen
    private String Movies;
    private String Series;
    private String myFavorites;
    private String exit;
    private String result;
    Scanner sc = new Scanner(System.in);
    private int ch;
    private String IdOfFilm;
//Text baseret main menu.
    public MainMenu(){
        System.out.println("*********************HOVEDMENU**************************");
        System.out.println("========================================================");
        System.out.println("DU HAR FØLGENDE VALGMULIGHEDER:");
        System.out.println("                     1. Film:");
        System.out.println("                   2. Serier:");
        System.out.println("          3. Dine favoritter:");
        System.out.println("       4. Afslut hovedmenuen:");

    }

public void menuChoice(){
    System.out.println("ENTER YOUR CHOICE ");
        ch= sc.nextInt();
        switch (ch){
            case 1:// Film
                System.out.println("You have chosen Film");
                System.out.println();
                System.out.println("ENTER YOUR CHOSEN FILMS GENRE");
                IdOfFilm = sc.nextLine();
                result ="god fornøjelse med filmen" + ch + IdOfFilm;
                System.out.println(result);

                    break;


            default:
                    break;
        }
}


}
