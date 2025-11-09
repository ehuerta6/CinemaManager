package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer extends User {

    private int loyaltyPoints;
    private double balance;
    private String membershipLevel;
    private Map<Integer, Ticket> tickets; // Map of ticketId to Ticket
    private ArrayList< Purchase> purchaseHistory;

    public Customer(int id, String name, String email, String password, int loyaltyPoints, String membershipLevel) {
        super(id, name, email, password);
        this.loyaltyPoints = loyaltyPoints;
        this.membershipLevel = membershipLevel;
        this.tickets = new HashMap<>();
    }
}
