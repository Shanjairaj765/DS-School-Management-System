package view;

import controller.BookingController;
import controller.MovieController;
import model.Booking;
import model.Customer;
import model.Movie;
import model.Seat;
import model.Show;
import model.Theatre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookMyShowApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AppView view = new AppView();

        
        List<Movie> movies = Arrays.asList(
                new Movie("Leo", "Action", 164),
                new Movie("Vikram", "Action", 174),
                new Movie("Master", "Action", 179)
        );

        
        Theatre theatre = new Theatre(
                "PVR Cinemas",
                "Chennai"
        );

        
        List<Show> shows = Arrays.asList(
                new Show(1, movies.get(0), theatre, "10:00 AM", 10),
                new Show(2, movies.get(0), theatre, "6:30 PM", 10),
                new Show(3, movies.get(1), theatre, "2:30 PM", 10),
                new Show(4, movies.get(2), theatre, "9:00 PM", 10)
        );

        
        List<Seat> seats = Arrays.asList(
                new Seat("A1", 250.0),
                new Seat("A2", 250.0),
                new Seat("A3", 250.0),
                new Seat("A4", 250.0),
                new Seat("A5", 250.0)
        );

        MovieController movieController =
                new MovieController(movies, shows);

        BookingController bookingController =
                new BookingController();

        System.out.println("================================");
        System.out.println("     WELCOME TO BOOK MY SHOW");
        System.out.println("================================");

        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        Customer customer = new Customer(name, email);

       
        view.showAvailableMovies(movies);

        System.out.print("\nEnter movie name: ");
        String movieName = sc.nextLine();

        Movie selectedMovie =
                movieController.searchMovies(movieName);

        if (selectedMovie == null) {
            view.showError("Movie not found.");
            sc.close();
            return;
        }

       
        List<Show> availableShows =
                movieController.displayShows(selectedMovie);

        view.showAvailableShows(availableShows);

        System.out.print("\nChoose show number: ");
        int showChoice = sc.nextInt();

        if (showChoice < 1 ||
                showChoice > availableShows.size()) {

            view.showError("Invalid show choice.");
            sc.close();
            return;
        }

        Show selectedShow =
                availableShows.get(showChoice - 1);

        
        view.showSeatMap(seats);

        System.out.print("\nHow many seats do you want? ");
        int numberOfSeats = sc.nextInt();
        sc.nextLine();

        List<Seat> selectedSeats = new ArrayList<>();

        for (int i = 1; i <= numberOfSeats; i++) {

            System.out.print(
                    "Enter seat number " + i + ": "
            );

            String seatNumber = sc.nextLine();

            Seat foundSeat = null;

            for (Seat seat : seats) {
                if (seat.getSeatNumber()
                        .equalsIgnoreCase(seatNumber)) {

                    foundSeat = seat;
                    break;
                }
            }

            if (foundSeat == null || foundSeat.isBooked()) {
                view.showError(
                        "Seat " + seatNumber +
                        " is not available."
                );

                sc.close();
                return;
            }

            if (selectedSeats.contains(foundSeat)) {
                view.showError(
                        "You selected the same seat twice."
                );

                sc.close();
                return;
            }

            selectedSeats.add(foundSeat);
        }

        Booking booking =
                bookingController.processBooking(
                        customer,
                        selectedShow,
                        selectedSeats
                );

        if (booking == null) {
            view.showError("Booking failed.");
        } else {
            view.showBookingConfirmation(booking);
        }

        sc.close();
    }
}