public class Booking {

    private int bookingId;
    private User user;
    private Show show;
    private int numberOfSeats;
    private double totalAmount;

    public Booking(int bookingId, User user, Show show,
                   int numberOfSeats, double totalAmount) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.numberOfSeats = numberOfSeats;
        this.totalAmount = totalAmount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}