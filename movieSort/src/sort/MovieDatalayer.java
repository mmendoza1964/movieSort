package sort;

import java.util.Arrays;

/**
 * Holds data to work with
 * @author Mark Mendoza
 * @version 1.0
 */
public class MovieDatalayer {
    private Movie[] movies;
    public static final int MOVIE_COUNT = 71;

    /**
     * Constructor for datalayer
     */
    public MovieDatalayer()
    {
        movies = new Movie[MOVIE_COUNT]; //initialize array to hold movies
    }

    /**
     * @return Movie object
     */
    public Movie[] getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "MovieDatalayer{" +
                "movies=" + Arrays.toString(movies) +
                '}';
    }
}
