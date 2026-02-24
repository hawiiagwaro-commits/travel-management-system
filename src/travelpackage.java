public class TravelPackage extends Service implements Discountable {

    private String destination;
    private int days;

    public TravelPackage(String serviceId, double basePrice, String destination, int days) {
        super(serviceId, basePrice);
        this.destination = destination;
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public int getDays() {
        return days;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * days;
    }

    @Override
    public double applyDiscount(double percentage) {
        double price = calculatePrice();
        return price - (price * percentage / 100);
    }
}
