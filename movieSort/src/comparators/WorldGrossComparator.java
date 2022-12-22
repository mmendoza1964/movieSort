package comparators;

import sort.Movie;

import java.util.Comparator;

/**
 * Compares film world gross values
 * @author Mark Mendoza
 * @version 1.0
 */
public class WorldGrossComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return (int) (movie1.getWorldwideGross() - movie2.getWorldwideGross());
    }
}
