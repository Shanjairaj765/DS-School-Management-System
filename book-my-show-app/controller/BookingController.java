package controller;

import model.Booking;
import model.Customer;
import model.Show;
import model.Seat;

import java.util.List;

public class BookingController {

    public Booking processBooking(Customer customer,
                                  Show show,
                                  List<Seat> seats) {

        double totalAmount = 0;

        for (Seat seat : seats) {
            seat.bookSeat();
            totalAmount += seat.getPrice();
        }

        Booking booking = new Booking("B001", totalAmount);
        booking.confirmBooking();

        System.out.println("Booking confirmed successfully!");

        return booking;
    }

    public void cancelBooking(String bookingId) {
        System.out.println("Booking " + bookingId + " cancelled successfully.");
    }
}