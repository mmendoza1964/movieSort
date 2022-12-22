package comparators;

import sort.Movie;

import java.util.Comparator;

/**
 * Compares film profit rating values
 * @author Mark Mendoza
 * @version 1.0
 */
public class ProfitComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return (int) (movie1.getProfitability() - movie2.getProfitability());
    }
}
