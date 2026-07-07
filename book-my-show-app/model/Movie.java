package model;

public class Movie {

    private int movieId;
    private String movieName;
    private String language;
    private int duration;

    public Movie(int movieId, String movieName, String language, int duration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.language = language;
        this.duration = duration;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getLanguage() {
        return language;
    }

    public int getDuration() {
        return duration;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}