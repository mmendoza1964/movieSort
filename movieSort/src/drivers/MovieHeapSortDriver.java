package drivers;

import comparators.AudienceComparator;
import sort.Movie;
import sort.MovieFileIO;
import sort.MovieHeapSort;

import java.util.Comparator;

/**
 * Driver class for movie heap sort
 * @author Mark Mendoza
 * @version 1.0
 */
public class MovieHeapSortDriver {
    private static Movie[] movies = MovieFileIO.readFile("src/files/movies.csv");
    private static Comparator<Movie> comparator = new AudienceComparator();

    /**
     * @param args string of args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the MovieHeapSortDriver!");
        MovieHeapSort heapSort = new MovieHeapSort(movies, comparator);
        heapSort.sort();
        heapSort.showMovies();
    }
}
