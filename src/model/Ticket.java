package model;

import utils.Constants;

public class Ticket {

    private int ticketId;
    private Seat seat;
    private Movie movie;
    private double price;

    public Ticket(int ticketId, Seat seat, Movie movie) {
        this.ticketId = ticketId;
        this.seat = seat;
        this.movie = movie;
        this.price = Constants.BASE_TICKET_PRICE;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
