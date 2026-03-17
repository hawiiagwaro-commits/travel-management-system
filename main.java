import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Customer name: ");
            String name = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Passport: ");
            String passport = input.nextLine();

            Customer c1 = new Customer(name, email, passport);

            System.out.print("Employee name: ");
            String ename = input.nextLine();

            System.out.print("Employee email: ");
            String eemail = input.nextLine();

            System.out.print("Salary: ");
            double sal = input.nextDouble();
            input.nextLine();

            Employee e1 = new Employee(ename, eemail, sal);

            System.out.print("Package ID: ");
            String id = input.nextLine();

            System.out.print("Base price: ");
            double price = input.nextDouble();

            System.out.print("Days: ");
            int days = input.nextInt();
            input.nextLine();

            System.out.print("Destination: ");
            String dest = input.nextLine();

            TravelPackage tp = new TravelPackage(id, price, dest, days);

            Booking b1 = new Booking("B01", c1, tp);

            System.out.println("\n--- Booking Info ---");
            c1.displayRole();
            e1.displayRole();
            b1.displayBooking();

            System.out.print("\nEnter discount % (0 if none): ");
            double discount = input.nextDouble();

            double finalPrice = tp.applyDiscount(discount);
            System.out.println("Price after discount: " + finalPrice);

            System.out.print("Enter payment: ");
            double pay = input.nextDouble();

            b1.processPayment(pay);

        } catch (Exception e) {
            System.out.println("Error: wrong input type.");
        } finally {
            System.out.println("Program finished.");
            input.close();
        }
    }
}