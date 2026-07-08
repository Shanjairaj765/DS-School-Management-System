package controller;

import model.Booking;
import model.Customer;
import model.Seat;
import model.Show;

import java.util.List;

public class BookingController {

    private int bookingCounter = 1;

    public Booking processBooking(
            Customer customer,
            Show show,
            List<Seat> selectedSeats) {

        if (selectedSeats == null || selectedSeats.isEmpty()) {
            return null;
        }

        for (Seat seat : selectedSeats) {
            if (seat.isBooked()) {
                return null;
            }
        }

        if (!show.bookSeats(selectedSeats.size())) {
            return null;
        }

        double totalAmount = 0;

        for (Seat seat : selectedSeats) {
            seat.bookSeat();
            totalAmount += seat.getPrice();
        }

        String bookingId = "B" + bookingCounter;
        bookingCounter++;

        Booking booking = new Booking(
                bookingId,
                customer,
                show,
                selectedSeats,
                totalAmount
        );

        booking.confirmBooking();

        return booking;
    }

    public void cancelBooking(Booking booking) {
        booking.cancelBooking();
    }
}