package view;

import java.util.List;
import model.Purchase;
import model.Ticket;
import utils.Constants;
import utils.Logger;

public class PurchaseView {

    public void showPurchaseDetails(Purchase purchase) {
        System.out.println("----- Purchase " + purchase.getId() + " -----");
        System.out.println("Date: " + purchase.getPurchaseDate());
        System.out.println("Total Amount: $" + purchase.getTotalAmount());
        System.out.println("Tickets:");
        for (Ticket ticket : purchase.getTickets()) {
            System.out.println("Ticket ID: " + ticket.getTicketId() + ", Price: $" + ticket.getPrice());
        }
        System.out.println(Constants.LINES);
        Logger.getInstance().info("Purchase info displayed: Purchase ID " + purchase.getId());
    }

    public void showAllPurchasesDetails(List<Purchase> purchases) {
        System.out.println("----- All Purchases -----");
        for (Purchase purchase : purchases) {
            System.out.println("Purchase ID: " + purchase.getId()
                    + " Date: " + purchase.getPurchaseDate()
                    + " Total Amount: $" + purchase.getTotalAmount()
                    + " Number of Tickets: " + purchase.getTickets().size()
            );
        }
        System.out.println(Constants.LINES);
        Logger.getInstance().info("All purchases info displayed");
    }

}
