import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Booking> bookings = new ArrayList<>();

        try {

            System.out.print("Customer name: ");
            String name = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Passport: ");
            String passport = input.nextLine();

            Customer c1 = new Customer(name, email, passport);

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

            // Add to collection
            bookings.add(b1);

            System.out.println("\n--- All Bookings ---");
            for (Booking b : bookings) {
                b.displayBooking();
            }

            // Save to file
            BufferedWriter writer = new BufferedWriter(new FileWriter("bookings.txt"));

            for (Booking b : bookings) {
                writer.write(b.toString());
                writer.newLine();
            }

            writer.close();
            System.out.println("Bookings saved to file.");

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader("bookings.txt"));

            String line;
            System.out.println("\n--- Reading from file ---");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Error occurred.");
        } finally {
            input.close();
            System.out.println("Program finished.");
        }
    }
}