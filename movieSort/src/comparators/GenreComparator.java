package comparators;

import sort.Movie;

import java.util.Comparator;

/**
 * Compares film genre values
 * @author Mark Mendoza
 * @version 1.0
 */
public class GenreComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getGenre().compareTo(movie2.getGenre());
    }
}
