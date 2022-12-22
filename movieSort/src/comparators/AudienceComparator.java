package comparators;

import sort.Movie;
import java.util.Comparator;

/**
 * Compares audience score values
 * @author Mark Mendoza
 * @version 1.0
 */
public class AudienceComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getAudienceScore() - movie2.getAudienceScore();
    }
}
