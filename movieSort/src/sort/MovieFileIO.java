package sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reads file into a movie array
 * @author Mark Mendoza
 * @version 1.0
 */
public class MovieFileIO {

    /**
     * Reads file into a movie array
     * @param fileName name of file
     * @return array of movies
     */
    public static Movie[] readFile(String fileName)
    {
        MovieDatalayer datalayer = new MovieDatalayer();
        try (Scanner reader = new Scanner(new File(fileName)))
        {
            int count = 0;
            reader.nextLine(); //skip first line

            while (reader.hasNextLine())
            {
                String[] parts = reader.nextLine().split(",");
                datalayer.getMovies()[count] = new Movie(parts[0], parts[1], parts[2],
                        Integer.parseInt(parts[3]), Double.parseDouble(parts[4]),
                        Integer.parseInt(parts[5]), Double.parseDouble(parts[6]),
                        Integer.parseInt(parts[7]));
                count++;
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Input file not found");
        }
        return datalayer.getMovies();
    }
}
