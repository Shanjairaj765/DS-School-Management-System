package model;

public class Seat {

    private String seatNumber;
    private double price;
    private boolean isBooked;

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public boolean bookSeat() {
        if (isBooked) {
            return false;
        }

        isBooked = true;
        return true;
    }

    public void cancelSeat() {
        isBooked = false;
    }
}