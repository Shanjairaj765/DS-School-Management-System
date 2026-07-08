package model;

public class Show {

    private int showId;
    private Movie movie;
    private Theatre theatre;
    private String showTime;
    private int availableSeats;

    public Show(int showId, Movie movie, Theatre theatre,
                String showTime, int availableSeats) {

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

    public boolean bookSeats(int count) {

        if (count <= 0) {
            return false;
        }

        if (count <= availableSeats) {
            availableSeats = availableSeats - count;
            return true;
        }

        return false;
    }
}