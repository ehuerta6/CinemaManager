package view;

import java.util.List;
import model.Ticket;
import utils.Constants;
import utils.Logger;

public class TicketView {

    public void showTicketDetails(Ticket ticket) {
        System.out.println("----- Ticket Details -----");
        System.out.println("Movie: " + ticket.getMovie().getTitle());
        System.out.println("Room: " + ticket.getMovie().getRoom().getRoomNumber());
        System.out.println("Show Time: " + ticket.getMovie().getShowTime());
        System.out.println("Seat: Row " + ticket.getSeat().getRow() + ", Number " + ticket.getSeat().getNumber());
        System.out.println("Price: $" + ticket.getPrice());
        System.out.println("--------------------------");

        Logger.getInstance().info("Ticket info displayed: Ticket ID " + ticket.getTicketId());
    }

    public void showAllTicketsDetails(List<Ticket> tickets) {
        System.out.println("----- All Tickets -----");
        for (Ticket ticket : tickets) {
            System.out.println("Ticket ID: " + ticket.getTicketId()
                    + " Movie: " + ticket.getMovie().getTitle()
                    + " Room: " + ticket.getMovie().getRoom().getRoomNumber()
                    + " Show Time: " + ticket.getMovie().getShowTime()
                    + " Seat: Row " + ticket.getSeat().getRow() + ", Number " + ticket.getSeat().getNumber()
                    + " Price: $" + ticket.getPrice()
            );
        }
        System.out.println(Constants.LINES);
        Logger.getInstance().info("All tickets info displayed");
    }
}
