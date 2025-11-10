package model;

import java.util.ArrayList;
import java.util.HashMap;
import utils.MembershipLevel;

public class Customer extends User {

    private int loyaltyPoints;
    private MembershipLevel membershipLevel;
    private HashMap<Integer, Ticket> tickets; // Map of ticketId to Ticket
    private ArrayList<Purchase> purchaseHistory;

    public Customer(int id, String name, String email, String password, int loyaltyPoints, MembershipLevel membershipLevel, double balance) {
        super(id, name, email, password, balance);
        this.loyaltyPoints = loyaltyPoints;
        this.membershipLevel = membershipLevel;
        this.tickets = new HashMap<>();
        this.purchaseHistory = new ArrayList<>();
    }
}
