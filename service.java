public abstract class Service {
    private String serviceId;
    private double basePrice;

    public Service(String serviceId, double basePrice) {
        this.serviceId = serviceId;
        this.basePrice = basePrice;
    }

    public String getServiceId() {
        return serviceId;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double calculatePrice();
}