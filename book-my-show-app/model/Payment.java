public class Payment {

    private int paymentId;
    private Booking booking;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;

    public int getPaymentId() {
        return paymentId;
    }

    public Booking getBooking() {
        return booking;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}