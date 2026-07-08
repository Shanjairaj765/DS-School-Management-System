package controller;

import model.Movie;
import model.Show;
import java.util.ArrayList;
import java.util.List;

public class MovieController {

    private List<Movie> movies;
    private List<Show> shows;

    public MovieController(List<Movie> movies, List<Show> shows) {
        this.movies = movies;
        this.shows = shows;
    }

    public Movie searchMovies(String keyword) {

        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(keyword)) {
                return movie;
            }
        }

        return null;
    }

    public List<Show> displayShows(Movie movie) {

        List<Show> matchingShows = new ArrayList<>();

        for (Show show : shows) {
            if (show.getMovie().getTitle()
                    .equalsIgnoreCase(movie.getTitle())) {

                matchingShows.add(show);
            }
        }

        return matchingShows;
    }
}