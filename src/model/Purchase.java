package model;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {

    private int id;

    private List<Ticket> tickets;
    private double totalAmount;
    private LocalDateTime purchaseDate;

    public Purchase(List<Ticket> tickets, int id) {
        this.tickets = tickets;
        this.purchaseDate = LocalDateTime.now();
        this.totalAmount = tickets.stream().mapToDouble(Ticket::getPrice).sum();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

}
