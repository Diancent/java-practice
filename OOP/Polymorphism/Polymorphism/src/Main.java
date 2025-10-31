import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie movie = new Adventure("Star Wars");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Sci-Fi, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("Adventure", "Jaws");
        jaws.watchMovie();
    }
}
