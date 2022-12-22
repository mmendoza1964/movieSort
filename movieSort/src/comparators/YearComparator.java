package comparators;

import sort.Movie;

import java.util.Comparator;

/**
 * Compares film release year values
 * @author Mark Mendoza
 * @version 1.0
 */
public class YearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getYear() - movie2.getYear();
    }
}
