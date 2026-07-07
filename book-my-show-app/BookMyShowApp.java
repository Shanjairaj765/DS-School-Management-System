public class BookMyShowApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     WELCOME TO BOOK MY SHOW");
        System.out.println("================================");

        
        User user = new User();
        user.setUserId(1);
        user.setUserName("Shanjai");
        user.setEmail("shanjai@gmail.com");
        user.setPhoneNumber("9876543210");

        System.out.println("\nUser created successfully!");

        
        Movie movie = new Movie();

        
        Theatre theatre = new Theatre();

        
        Show show = new Show();

        
        Booking booking = new Booking();
        booking.setBookingId(101);
        booking.setUser(user);
        booking.setShow(show);
        booking.setNumberOfSeats(2);
        booking.setTotalAmount(500.0);

        System.out.println("Booking created successfully!");

       
        BookingController bookingController =
                new BookingController();

        bookingController.bookTicket(booking);

      
        Payment payment = new Payment();
        payment.setPaymentId(1001);
        payment.setBooking(booking);
        payment.setAmount(500.0);
        payment.setPaymentMethod("UPI");
        payment.setPaymentStatus("SUCCESS");

      
        PaymentController paymentController =
                new PaymentController();

        paymentController.processPayment(payment);

        System.out.println("\n================================");
        System.out.println("       BOOKING COMPLETED");
        System.out.println("================================");
    }
}