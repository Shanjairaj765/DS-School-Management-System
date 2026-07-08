package controller;
import model.Booking;
public class BookingController {

    public void bookTicket(Booking booking) {
        System.out.println("Booking successful!");
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("Number of seats: " + booking.getNumberOfSeats());
        System.out.println("Total amount: " + booking.getTotalAmount());
    }

    public void cancelBooking(Booking booking) {
        System.out.println("Booking " + booking.getBookingId() + " cancelled successfully!");
    }
}