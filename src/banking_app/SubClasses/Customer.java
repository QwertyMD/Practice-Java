package banking_app.SubClasses;

public class Customer {
    private final String firstName, lastName;  // first name and last name are never changed

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;  // set first name
        this.lastName = lastName;  // set last name
    }

    public String getFirstName() {
        return firstName;  // get first name
    }

    public String getLastName() {
        return lastName;  // get last name
    }
}
