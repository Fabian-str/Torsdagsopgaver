package task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Paul", "Andersen", "And1967"));

        printCustomers(customers);
    }

    static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
