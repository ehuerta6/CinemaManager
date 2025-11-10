package view;

import java.util.List;
import model.Movie;
import model.Room;
import service.Logger;
import utils.Constants;

public class RoomView {

    public void showRoomDetails(Room room) {
        System.out.println("----- Room " + room.getRoomNumber() + " -----");
        System.out.println("Type: " + room.getType());
        System.out.println("Capacity: " + room.getCapacity() + " seats");
        System.out.println(Constants.LINES);

        Logger.getInstance().info("Room info displayed: Room Number " + room.getRoomNumber());
    }

    public void showAllRoomsDetails(List<Room> rooms) {
        System.out.println("----- All Rooms -----");
        for (Room room : rooms) {
            System.out.println("Room Number: " + room.getRoomNumber()
                    + " Type: " + room.getType()
                    + " Capacity: " + room.getCapacity() + " seats"
            );
        }
        System.out.println(Constants.LINES);
        Logger.getInstance().info("All rooms info displayed");
    }

    public void showMoviesInRoom(Room room, List<Movie> movies) {
        System.out.println("----- Movies in Room " + room.getRoomNumber() + " -----");
        if (movies == null || movies.isEmpty()) {
            System.out.println("No movies scheduled in this room.");
        } else {
            for (Movie movie : movies) {
                System.out.println("Title: " + movie.getTitle()
                        + " Duration: " + movie.getDuration() + " mins"
                        + " Genre: " + movie.getGenre());
            }
        }
        System.out.println(Constants.LINES);
        Logger.getInstance().info("Movies displayed for Room Number " + room.getRoomNumber());
    }
}
