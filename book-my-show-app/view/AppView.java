package view;

import model.Booking;
import model.Movie;
import model.Seat;
import model.Show;

import java.util.List;

public class AppView {

    public void showAvailableMovies(List<Movie> movies) {
        System.out.println("\n========== AVAILABLE MOVIES ==========");

        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);

            System.out.println(
                    (i + 1) + ". " +
                    movie.getTitle() + " | " +
                    movie.getGenre() + " | " +
                    movie.getDurationMinutes() + " minutes"
            );
        }
    }

    public void showAvailableShows(List<Show> shows) {
        System.out.println("\n========== AVAILABLE SHOWS ==========");

        for (int i = 0; i < shows.size(); i++) {
            Show show = shows.get(i);

            System.out.println(
                    (i + 1) + ". " +
                    show.getShowTime() + " | " +
                    show.getTheatre().getName()
            );
        }
    }

    public void showSeatMap(List<Seat> seats) {
        System.out.println("\n========== AVAILABLE SEATS ==========");

        for (Seat seat : seats) {
            String status = seat.isBooked()
                    ? "BOOKED"
                    : "AVAILABLE";

            System.out.println(
                    seat.getSeatNumber() +
                    " | Rs." + seat.getPrice() +
                    " | " + status
            );
        }
    }

    public void showBookingConfirmation(Booking booking) {
        System.out.println("\n========== BOOKING CONFIRMED ==========");
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("Customer: " + booking.getCustomer().getName());
        System.out.println("Movie: " + booking.getShow().getMovie().getTitle());
        System.out.println("Theatre: " + booking.getShow().getTheatre().getName());
        System.out.println("Show Time: " + booking.getShow().getShowTime());

        System.out.print("Seats: ");

        for (Seat seat : booking.getSeats()) {
            System.out.print(seat.getSeatNumber() + " ");
        }

        System.out.println();
        System.out.println("Total Amount: Rs." + booking.getTotalAmount());
        System.out.println("Confirmed: " + booking.isConfirmed());
        System.out.println("=======================================");
    }

    public void showError(String message) {
        System.out.println("\nERROR: " + message);
    }
}
