public class Booking implements Payable {

    private String bookingId;
    private Customer customer;
    private TravelPackage travelPackage;
    private boolean paymentStatus;

    public Booking(String bookingId, Customer customer, TravelPackage travelPackage) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.travelPackage = travelPackage;
        this.paymentStatus = false;
    }

    public String getBookingId() {
        return bookingId;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public void processPayment(double amount) {
        double total = travelPackage.calculatePrice();

        if (amount >= total) {
            paymentStatus = true;
            System.out.println("Payment successful!");
        } else {
            System.out.println("Insufficient payment.");
        }
    }

    public void displayBooking() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Destination: " + travelPackage.getDestination());
        System.out.println("Total Price: " + travelPackage.calculatePrice());
    }
}