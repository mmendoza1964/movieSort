package comparators;

import sort.Movie;

import java.util.Comparator;

/**
 * Compares film title values
 * @author Mark Mendoza
 * @version 1.0
 */
public class FilmComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getFilm().compareTo(movie2.getFilm());
    }
}
