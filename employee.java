public class Employee extends Person {

    private double salary;

    public Employee(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void displayRole() {
        System.out.println("Employee: " + getName());
    }
}