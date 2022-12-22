package drivers;

import comparators.*;
import sort.Movie;
import sort.MovieFileIO;

import java.util.Arrays;
import java.util.Random;

/**
 * Driver class for MovieDriver. Can display and sort Movie arrays
 * @author Mark Mendoza
 * @version 1.0
 */
public class MovieDriver {
    public static final String FILE_TO_READ = "src/files/movies.csv";
    private static Movie[] movies;

    /**
     * @param args string of args
     */
    public static void main(String[] args) {
        welcome(); //show welcome message
        loadFile(); //load file to use

        int choice = 0;
        while (choice != 4)
        {
            choice = choices(); //get user choice

            switch (choice)
            {
                case 1:
                    showAllMovies();
                    break;
                case 2:
                    showRandomMovie();
                    break;
                case 3:
                    sortMovies();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    break;
            }
        }

    }

    private static void sortMovies() {
        int comparatorChoice = 0;

        while (comparatorChoice < 1 || comparatorChoice > 8)
        {
            displaySortTypeOptions(); //display comparator options
            comparatorChoice = chooseComparator();

            switch (comparatorChoice)
            {
                case 1:
                    sortByFilm();
                    break;
                case 2:
                    sortByGenre();
                    break;
                case 3:
                    sortByStudio();
                    break;
                case 4:
                    sortByAudienceScore();
                    break;
                case 5:
                    sortByProfit();
                    break;
                case 6:
                    sortByRT();
                    break;
                case 7:
                    sortByGross();
                    break;
                case 8:
                    sortByYear();
                    break;
                default:
                    System.out.println("Invalid number, must be 1-8");
                    break;
            }
        }
    }

    private static void sortByYear() {
        System.out.println("Sorting by year...");
        YearComparator yearComparator = new YearComparator();
        Arrays.sort(movies,yearComparator);
        showAllMovies();
    }

    private static void sortByGross() {
        System.out.println("Sorting by worldwide gross...");
        WorldGrossComparator worldGrossComparator = new WorldGrossComparator();
        Arrays.sort(movies, worldGrossComparator);
        showAllMovies();
    }

    private static void sortByRT() {
        System.out.println("Sorting by RT score...");
        RTComparator rtComparator = new RTComparator();
        Arrays.sort(movies,rtComparator);
        showAllMovies();
    }

    private static void sortByAudienceScore() {
        System.out.println("Sorting by audience score...");
        AudienceComparator audienceComparator = new AudienceComparator();
        Arrays.sort(movies,audienceComparator);
        showAllMovies();
    }

    private static void sortByStudio() {
        System.out.println("Sorting by studio...");
        StudioComparator studioComparator = new StudioComparator();
        Arrays.sort(movies,studioComparator);
        showAllMovies();
    }

    private static void sortByGenre() {
        System.out.println("Sorting by genre...");
        GenreComparator genreComparator = new GenreComparator();
        Arrays.sort(movies,genreComparator);
        showAllMovies();
    }

    private static void sortByFilm() {
        System.out.println("Sorting by film...");
        FilmComparator filmComparator = new FilmComparator();
        Arrays.sort(movies, filmComparator);
        showAllMovies();
    }

    private static void sortByProfit() {
        System.out.println("Sorting by profit...");
        ProfitComparator profitComparator = new ProfitComparator();
        Arrays.sort(movies,profitComparator);
        showAllMovies();
    }

    private static int chooseComparator() {
        return driver.Console.getInt();
    }

    private static void displaySortTypeOptions() {
        System.out.println("Enter a comparator:");
        printSortTypeOptions();
    }

    private static void printSortTypeOptions() {
        System.out.println("1. By film");
        System.out.println("2. By genre");
        System.out.println("3. By studio");
        System.out.println("4. By audience");
        System.out.println("5. By profit");
        System.out.println("6. By RT score");
        System.out.println("7. By world gross");
        System.out.println("8. By year");
    }

    private static void showRandomMovie() {
        Random random = new Random();
        int randomInt = random.nextInt(movies.length);

        movieListHeader();
        displayMovieFormatted(movies[randomInt]);
    }

    private static void loadFile() {
        movies = MovieFileIO.readFile(FILE_TO_READ);
    }

    private static void showAllMovies() {
        movieListHeader();
        for (Movie movie : movies) {
            displayMovieFormatted(movie);
        }
    }

    private static void movieListHeader() {
        System.out.printf("%-30s%-15s%-25s%-10s%-15s%-5s%-10s%-5s\n", "FILM", "GENRE","STUDIO",
                "AUDIENCE","PROFIT","RT","GROSS","YEAR");
    }

    private static void displayMovieFormatted(Movie movie) {
        System.out.printf("%-30s%-15s%-25s%-10s%-15s%-5s%-10s%-5s\n", movie.getFilm(),
                movie.getGenre(), movie.getLeadStudio(),
                movie.getAudienceScore(), movie.getProfitability(),
                movie.getRottenTomatoScore(), movie.getWorldwideGross(),
                movie.getYear());
    }

    private static int choices() {
        int choice;

        displayChoices();
        choice = driver.Console.getInt();

        while (choice < 1 || choice > 4)
        {
            System.out.println("Invalid input (1-4)");
            displayChoices();
            choice = driver.Console.getInt();
        }
        return choice;
    }

    private static void displayChoices() {
        System.out.printf("%nPick from the following: %n");
        System.out.println("1. Show all movies");
        System.out.println("2. Show a random movie");
        System.out.println("3. Sort movies");
        System.out.println("4. Exit");
    }

    private static void welcome() {
        printAsteriskDivider();
        System.out.println("Welcome to the Movie Night Application\n");
        System.out.println("This program will display movie suggestions and " +
                "allow you to sort movies in different ways");
        printAsteriskDivider();
    }

    private static void printAsteriskDivider() {
        System.out.println("******************************************");
    }
}
