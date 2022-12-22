package comparators;

import sort.Movie;

import java.util.Comparator;

/**
 * Compares rotten tomatoes values
 * @author Mark Mendoza
 * @version 1.0
 */
public class RTComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getRottenTomatoScore() - movie2.getRottenTomatoScore();
    }
}
