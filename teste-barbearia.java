import java.util.ArrayList;
import java.util.List;

public class Barbearia {
    private List<Customer> customers;
    private List<Barber> barbers;

    public Barbearia() {
        customers = new ArrayList<>();
        barbers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addBarber(Barber barber) {
        barbers.add(barber);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Barber> getBarbers() {
        return barbers;
    }

    public static void main(String[] args) {
        Barbearia website = new Barbearia();

        // Create some customers
        Customer customer1 = new Customer("John", "Doe", "john.doe@example.com");
        Customer customer2 = new Customer("Jane", "Smith", "jane.smith@example.com");

        // Add the customers to the website
        website.addCustomer(customer1);
        website.addCustomer(customer2);

        // Create some barbers
        Barber barber1 = new Barber("Joao", "Silva", "joaosilva@example.com", "Monday, Wednesday, Friday");
        Barber barber2 = new Barber("Maria", "Souza", "mariasouza@example.com", "Tuesday, Thursday, Saturday");

        // Add the barbers to the website
        website.addBarber(barber1);
        website.addBarber(barber2);

        // Display the customers and barbers on the website
        System.out.println("Customers:");
        for (Customer customer : website.getCustomers()) {
            System.out.println(customer.getFullName() + " - " + customer.getEmail());
        }

        System.out.println("\nBarbers:");
        for (Barber barber : website.getBarbers()) {
            System.out.println(barber.getFullName() + " - " + barber.getEmail() + " - " + barber.getSchedule());
        }
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }
}

class Barber {
    private String firstName;
    private String lastName;
    private String email;
    private String schedule;

    public Barber(String firstName, String lastName, String email, String schedule) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.schedule = schedule;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getSchedule() {
        return schedule;
    }
}