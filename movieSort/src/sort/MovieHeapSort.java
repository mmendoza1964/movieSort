package sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Accepts movie array, assorts movies in a heap
 * @author Mark Mendoza
 * @version 1.0
 */
public class MovieHeapSort {
    private Movie[] movies;
    private Comparator<Movie> comparator;
    private int currentSize;

    /**
     * @param movies array of movies
     * @param comparator comparator object
     */
    public MovieHeapSort(Movie[] movies, Comparator<Movie> comparator)
    {
        this.movies = movies;
        this.comparator = comparator;
    }

    private void swap(int first, int second) {
        //Swap the elements at the input indices in the heap array
        Movie temp = movies[first];
        movies[first] = movies[second];
        movies[second] = temp;
    }

    /**
     * turns array into a heap
     * @param movies movies to be sorted
     */
    public void buildHeap(Movie[] movies)
    {
        //System.out.println("Last node with children index: " + (movies.length / 2));
        currentSize = movies.length-1;

        for (int i = currentSize/2; i >= 0; i--) {
            sink(i, movies[i]);
        }
    }

    /**
     * Sorts the heap
     */
    public void sort() {
        System.out.println("Performing sort...");

        buildHeap(movies);
        /*Movie result = deleteMin();
        System.out.println(result);*/
    }

    private Movie deleteMin()
    {
        if (currentSize == 0)
        {
            return null;
        }

        Movie result = movies[1];
        currentSize--;
        int newPos = sink(1, movies[currentSize + 1]);
        movies[newPos] = movies[currentSize + 1];

        return result;
    }

    private int sink(int hole, Movie movie)
    {
        while (2 * hole <= currentSize)
        {
            int left = hole * 2; //left child
            int right = left + 1; //right child
            int target; //target index

            //if right is safe to search && right is more significant than left
            if (right <= currentSize && (comparator.compare(movies[right],movies[left])) < 0)
            {
                target = right; //set target to right child
            }
            else
            {
                target = left; //else set target to left child
            }

            //if search target is larger
            if (comparator.compare(movies[target], movie) < 0)
            {
                swap(hole,target);
                hole = target; //set index to target in heap

            }
            else
            {
                break;
            }
        }
        return hole; //position for object in the heap
    }

    public void showMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public String toString() {
        return "MovieHeapSort{" +
                "movies=" + Arrays.toString(movies) +
                ", comparator=" + comparator +
                ", currentSize=" + currentSize +
                '}';
    }
}
