public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(
                "Hawii Flora",
                "hawii@email.com",
                "P123456"
        );

        Employee emp1 = new Employee(
                "James Mwangi",
                "james@email.com",
                50000
        );

        TravelPackage pkg1 = new TravelPackage(
                "TP01",
                20000,
                "Diani Beach",
                3
        );

        Booking booking1 = new Booking("B001", customer1, pkg1);

        customer1.displayRole();
        emp1.displayRole();

        booking1.displayBooking();

        booking1.processPayment(60000);
    }
}