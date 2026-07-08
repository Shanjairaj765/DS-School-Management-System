import model.*;
import controller.*;

public class BookMyShowApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     WELCOME TO BOOK MY SHOW");
        System.out.println("================================");

        User user = new User(
                1,
                "Shanjai",
                "shanjai@gmail.com",
                "9876543210"
        );

        Movie movie = new Movie(
                101,
                "Leo",
                "Tamil",
                164
        );

        Theatre theatre = new Theatre(
                201,
                "PVR Cinemas",
                "Chennai"
        );

        Show show = new Show(
                301,
                movie,
                theatre,
                "6:30 PM",
                100
        );

        Booking booking = new Booking(
                401,
                user,
                show,
                2,
                500.0
        );

        BookingController bookingController =
                new BookingController();

        bookingController.bookTicket(booking);

        Payment payment = new Payment();

        payment.setPaymentId(501);
        payment.setBooking(booking);
        payment.setAmount(500.0);
        payment.setPaymentMethod("UPI");
        payment.setPaymentStatus("SUCCESS");

        PaymentController paymentController =
                new PaymentController();

        paymentController.processPayment(payment);

        System.out.println();
        System.out.println("================================");
        System.out.println("       BOOKING COMPLETED");
        System.out.println("================================");
    }
}