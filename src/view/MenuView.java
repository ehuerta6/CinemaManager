package view;

import service.Logger;
import utils.Constants;

public class MenuView {

    public void showAdminMenu() {
        System.out.println("----- Admin Menu -----");
        System.out.println("1. View Users");
        System.out.println("2. Manage Users");
        System.out.println("3. View Rooms");
        System.out.println("4. Manage Rooms");
        System.out.println("5. View Movies");
        System.out.println("6. Manage Movies");
        System.out.println("7. Logout");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Admin menu displayed");
    }

    public void showAdminUserMenu() {
        System.out.println("----- Users Menu -----");
        System.out.println("1. View All Users");
        System.out.println("2. Search User by ID");
        System.out.println("3. Add New User");
        System.out.println("4. Update User");
        System.out.println("5. Delete User");
        System.out.println("6. Back to Admin Menu");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Admin user menu displayed");
    }

    public void showAdminRoomMenu() {
        System.out.println("----- Rooms Menu -----");
        System.out.println("1. View All Rooms");
        System.out.println("2. Search Room by Number");
        System.out.println("3. Add New Room");
        System.out.println("4. Update Room");
        System.out.println("5. Delete Room");
        System.out.println("6. Back to Admin Menu");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Admin room menu displayed");
    }

    public void showAdminMovieMenu() {
        System.out.println("----- Movies Menu -----");
        System.out.println("1. View All Movies");
        System.out.println("2. Search Movie by ID");
        System.out.println("3. Add New Movie");
        System.out.println("4. Update Movie");
        System.out.println("5. Delete Movie");
        System.out.println("6. Back to Admin Menu");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Admin movie menu displayed");
    }

    public void showCustomerMenu() {
        System.out.println("----- Customer Menu -----");
        System.out.println("1. View Movies");
        System.out.println("2. View Rooms");
        System.out.println("3. Purchase Tickets");
        System.out.println("4. View Purchase History");
        System.out.println("5. Logout");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Customer menu displayed");
    }

    public void showCustomerMovieMenu() {
        System.out.println("----- Movies Menu -----");
        System.out.println("1. View All Movies");
        System.out.println("2. Search Movie by ID");
        System.out.println("3. Back to Customer Menu");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Customer movie menu displayed");
    }

    public void showCustomerRoomsMenu() {
        System.out.println("----- Rooms Menu -----");
        System.out.println("1. View All Rooms");
        System.out.println("2. Search Room by Number");
        System.out.println("3. Back to Customer Menu");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Customer rooms menu displayed");
    }

    public void showCustomerSeatingMenu() {
        System.out.println("----- Seating Menu -----");
        System.out.println("1. View Seating Arrangement");
        System.out.println("2. Select Seats");
        System.out.println("3. Confirm Booking");
        System.out.println("4. Cancel Booking");
        System.out.println("5. Back to Customer Menu");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Customer seating menu displayed");
    }

    public void showUserMenu() {
        System.out.println("----- User Menu -----");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Customer");
        System.out.println("3. Exit");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("User menu displayed");
    }
}
