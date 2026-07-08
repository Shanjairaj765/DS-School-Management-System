package model;

import java.util.List;

public class Booking {

    private String bookingId;
    private Customer customer;
    private Show show;
    private List<Seat> seats;
    private double totalAmount;
    private boolean isPaid;
    private boolean isConfirmed;

    public Booking(String bookingId, Customer customer,
                   Show show, List<Seat> seats,
                   double totalAmount) {

        this.bookingId = bookingId;
        this.customer = customer;
        this.show = show;
        this.seats = seats;
        this.totalAmount = totalAmount;
        this.isPaid = false;
        this.isConfirmed = false;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void confirmBooking() {
        isConfirmed = true;
    }

    public void cancelBooking() {
        isConfirmed = false;

        for (Seat seat : seats) {
            seat.cancelSeat();
        }
    }
}