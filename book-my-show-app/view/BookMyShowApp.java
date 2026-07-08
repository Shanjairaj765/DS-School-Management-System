package view;

import model.*;
import controller.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMyShowApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     WELCOME TO BOOK MY SHOW");
        System.out.println("================================");

       
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        Customer customer = new Customer(name, email);

        
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter movie genre: ");
        String genre = sc.nextLine();

        System.out.print("Enter movie duration in minutes: ");
        int duration = sc.nextInt();
        sc.nextLine();

        Movie movie = new Movie(
                movieName,
                genre,
                duration
        );

       
        System.out.print("Enter theatre name: ");
        String theatreName = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        Theatre theatre = new Theatre(
                theatreName,
                city
        );

        
        System.out.print("Enter show time: ");
        String showTime = sc.nextLine();

        Show show = new Show(
                301,
                movie,
                theatre,
                showTime,
                100
                
        );

       
        System.out.print("Enter first seat number: ");
        String seatNumber1 = sc.nextLine();

        System.out.print("Enter second seat number: ");
        String seatNumber2 = sc.nextLine();

        System.out.print("Enter price per seat: ");
        double price = sc.nextDouble();

        Seat seat1 = new Seat(seatNumber1, price);
        Seat seat2 = new Seat(seatNumber2, price);

        List<Seat> seats = new ArrayList<>();
        seats.add(seat1);
        seats.add(seat2);

       
        customer.viewMovies();

        MovieController movieController =
                new MovieController();

        movieController.searchMovies(movieName);
        movieController.displayShows(theatre, movie);

        customer.makeBooking();

        
        BookingController bookingController =
                new BookingController();

        Booking booking =
                bookingController.processBooking(
                        customer,
                        show,
                        seats
                );

       
        System.out.println();
        System.out.println("================================");
        System.out.println("        BOOKING DETAILS");
        System.out.println("================================");

        System.out.println(
                "Booking ID: " + booking.getBookingId()
        );

        System.out.println(
                "Total Amount: " + booking.getTotalAmount()
        );

        System.out.println(
                "Booking Confirmed: " + booking.isConfirmed()
        );

        System.out.println("================================");
        System.out.println("       BOOKING COMPLETED");
        System.out.println("================================");

        sc.close();
    }
}