package model;

public class Booking {

    private String bookingId;
    private double totalAmount;
    private boolean isPaid;
    private boolean isConfirmed;

    public Booking(String bookingId, double totalAmount) {
        this.bookingId = bookingId;
        this.totalAmount = totalAmount;
        this.isPaid = false;
        this.isConfirmed = false;
    }

    public String getBookingId() {
        return bookingId;
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
}