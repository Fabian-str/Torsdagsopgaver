package task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public String setUsername(String username) {
        return this.username = username;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + ". Username: " +  this.username;
    }
}
