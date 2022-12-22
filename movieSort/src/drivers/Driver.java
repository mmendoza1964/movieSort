package drivers;


import sort.MovieFileIO;
import sort.Movie;

/**
 * Test driver class
 * @author Mark Mendoza
 * @version 1.0
 */
public class Driver {

    public static final int AUDIENCE_SCORE = 82;
    public static final double PROFITABILITY = 82.12;
    public static final int ROTTEN_TOMATO_SCORE = 56;
    public static final double WORLDWIDE_GROSS = 92.12;
    public static final int YEAR = 1997;

    /**
     * @param args string of args
     */
    public static void main(String[] args) {
        testMovie();
        testDatalayer();
    }

    private static void testDatalayer() {
        Movie[] movies = MovieFileIO.readFile("src/files/movies.csv");
        System.out.printf("%-30s%-15s%-25s%-10s%-10s\n", "FILM", "GENRE","STUDIO",
                "AUDIENCE","PROFIT");
        for (Movie movie : movies) {
            System.out.printf("%-30s%-15s%-25s%-10s%-10s\n", movie.getFilm(),
                    movie.getGenre(),movie.getLeadStudio(),
                    movie.getAudienceScore(),movie.getProfitability());
        }
    }

    private static void testMovie() {
        Movie movie = new Movie("Title", "genre", "lead studio",
                AUDIENCE_SCORE, PROFITABILITY, ROTTEN_TOMATO_SCORE,
                WORLDWIDE_GROSS, YEAR);
        System.out.println(movie);
    }
}
