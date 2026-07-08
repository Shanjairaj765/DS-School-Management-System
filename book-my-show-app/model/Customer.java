package model;

public class Customer {

    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void viewMovies() {
        System.out.println(name + " is viewing available movies.");
    }

    public void makeBooking() {
        System.out.println(name + " is making a booking.");
    }
}