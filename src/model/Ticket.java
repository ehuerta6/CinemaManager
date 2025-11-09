package model;

public class Ticket {

    private int ticketId;
    private Seat seat;
    private Movie movie;
    private double price;

    public Ticket(int ticketId, Seat seat, Movie movie) {
        this.ticketId = ticketId;
        this.seat = seat;
        this.movie = movie;
    }
}
