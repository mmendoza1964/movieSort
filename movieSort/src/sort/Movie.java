package sort;

/**
 * Movie object holds movie data
 * @author Mark Mendoza
 * @version 1.0
 */
public class Movie {
    private String film;
    private String genre;
    private String leadStudio;
    private int audienceScore;
    private double profitability;
    private int rottenTomatoScore;
    private double worldwideGross;
    private int year;

    /**
     * Constructor for Movie
     * @param film title of film
     * @param genre genre of film
     * @param leadStudio lead studio
     * @param year year of release
     */
    //Simplified constructor, scores and profitability are given default values
    public Movie(String film, String genre, String leadStudio, int year)
    {
        this.film = film;
        this.genre = genre;
        this.leadStudio = leadStudio;
        this.audienceScore = 0;
        this.profitability = 0;
        this.rottenTomatoScore = 0;
        this.worldwideGross = 0;
        this.year = year;
    }

    /**
     * Constructor for Movie
     * @param film title of film
     * @param genre genre of film
     * @param leadStudio lead studio
     * @param audienceScore score from audience
     * @param profitability profit rating of film
     * @param rottenTomatoScore score from rotten tomatoes
     * @param worldwideGross worldwide gross
     * @param year year of release
     */
    public Movie(String film, String genre, String leadStudio, int audienceScore,
                 double profitability, int rottenTomatoScore,
                 double worldwideGross, int year)
    {
        this.film = film;
        this.genre = genre;
        this.leadStudio = leadStudio;
        this.audienceScore = audienceScore;
        this.profitability = profitability;
        this.rottenTomatoScore = rottenTomatoScore;
        this.worldwideGross = worldwideGross;
        this.year = year;
    }

    /**
     * @return title of film
     */
    public String getFilm() {
        return film;
    }

    /**
     * @return genre of film
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @return lead studio name
     */
    public String getLeadStudio() {
        return leadStudio;
    }

    /**
     * @return score from audience
     */
    public int getAudienceScore() {
        return audienceScore;
    }

    /**
     * @return profitability rating
     */
    public double getProfitability() {
        return profitability;
    }

    /**
     * @return score from rotten tomatoes
     */
    public int getRottenTomatoScore() {
        return rottenTomatoScore;
    }

    /**
     * @return worldwide gross
     */
    public double getWorldwideGross() {
        return worldwideGross;
    }

    /**
     * @return year of release
     */
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "film='" + film + '\'' +
                ", leadStudio='" + leadStudio + '\'' +
                ", audienceScore=" + audienceScore +
                ", profitability=" + profitability +
                ", rottenTomatoScore=" + rottenTomatoScore +
                ", year=" + year +
                '}';
    }
}
