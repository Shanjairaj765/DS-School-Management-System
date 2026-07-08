package controller;
import model.Payment;
public class PaymentController {

    public void processPayment(Payment payment) {
        System.out.println("Processing payment...");
        System.out.println("Payment ID: " + payment.getPaymentId());
        System.out.println("Amount: " + payment.getAmount());
        System.out.println("Payment Method: " + payment.getPaymentMethod());
        System.out.println("Payment Status: " + payment.getPaymentStatus());
    }

    public void refundPayment(Payment payment) {
        System.out.println("Refunding payment ID: " + payment.getPaymentId());
        System.out.println("Refund amount: " + payment.getAmount());
    }
}