public class Customer extends Person {

    private String passportNumber;

    public Customer(String name, String email, String passportNumber) {
        super(name, email);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public void displayRole() {
        System.out.println("Customer: " + getName());
    }
}