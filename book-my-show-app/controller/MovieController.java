package controller;

import model.Movie;
import model.Theatre;

public class MovieController {

    public void searchMovies(String keyword) {
        System.out.println("Searching for movie: " + keyword);
    }

    public void displayShows(Theatre theatre, Movie movie) {
        System.out.println("Displaying shows for: " + movie.getTitle());
    }
}