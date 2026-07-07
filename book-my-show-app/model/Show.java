package model;

public class Show {

    private int showId;
    private Movie movie;
    private Theatre theatre;
    private String showTime;
    private int availableSeats;

    public Show(int showId, Movie movie, Theatre theatre, String showTime, int availableSeats) {
        this.showId = showId;
        this.movie = movie;
        this.theatre = theatre;
        this.showTime = showTime;
        this.availableSeats = availableSeats;
    }

    public int getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public String getShowTime() {
        return showTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}