package model;

import utils.Constants;

public class Ticket {

    private int ticketId;
    private int seatRow;
    private int seatCol;
    private Movie movie;
    private double price;

    public Ticket(int ticketId, int seatRow, int seatCol, Movie movie) {
        this.ticketId = ticketId;
        this.seatRow = seatRow;
        this.seatCol = seatCol;
        this.movie = movie;
        this.price = Constants.BASE_TICKET_PRICE;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public int getSeatCol() {
        return seatCol;
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
