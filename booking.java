public class Booking implements Payable {

    private String bookingId;
    private Customer customer;
    private TravelPackage travelPackage;
    private boolean paymentStatus;

    public Booking(String bookingId, Customer customer, TravelPackage travelPackage) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.travelPackage = travelPackage;
        paymentStatus = false;
    }

    @Override
    public void processPayment(double amount) {
        double total = travelPackage.calculatePrice();

        if (amount >= total) {
            paymentStatus = true;
            System.out.println("Payment done successfully.");
        } else {
            System.out.println("Not enough payment.");
        }
    }

    public void displayBooking() {
        System.out.println("Booking: " + bookingId);
        System.out.println("Destination: " + travelPackage.getDestination());
        System.out.println("Days: " + travelPackage.getDays());
        System.out.println("Total Price: " + travelPackage.calculatePrice());
    }

    public String toString() {
        return bookingId + "," +
            customer.getName() + "," +
            travelPackage.getDestination() + "," +
            travelPackage.getDays() + "," +
            travelPackage.calculatePrice();
    }
}