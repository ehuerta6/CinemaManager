package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {

    private ArrayList<Ticket> tickets;
    private double totalAmount;
    private LocalDateTime purchaseDate;

    public Purchase(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
        this.purchaseDate = LocalDateTime.now();
        this.totalAmount = tickets.stream().mapToDouble(Ticket::getPrice).sum();
    }

}
