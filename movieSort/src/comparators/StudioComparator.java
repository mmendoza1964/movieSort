package comparators;

import sort.Movie;

import java.util.Comparator;

/**
 * Compares film lead studio values
 * @author Mark Mendoza
 * @version 1.0
 */
public class StudioComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getLeadStudio().compareTo(movie2.getLeadStudio());
    }
}
