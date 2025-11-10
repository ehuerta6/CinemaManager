package view;

import java.util.List;
import model.Movie;
import model.Seat;
import service.Logger;
import utils.Constants;

public class MovieView {

    public void showMovieDetails(Movie movie) {
        System.out.println("----- Movie " + movie.getId() + " -----");
        System.out.println("Title " + movie.getTitle());
        System.out.println("Genre " + movie.getGenre());
        System.out.println("Duration " + movie.getDuration() + " minutes");
        System.out.println("Room " + movie.getRoom().getRoomNumber());
        System.out.println("Show Time " + movie.getShowTime());
        System.out.println(Constants.LINES);
        Logger.getInstance().info("Movie info displayed: " + movie.getTitle());
    }

    public void showAllMoviesDetails(List<Movie> movies) {
        System.out.println("----- All Movies -----");
        for (Movie movie : movies) {
            System.out.println("Movie " + movie.getId()
                    + " Title: " + movie.getTitle()
                    + " Genre: " + movie.getGenre()
                    + " Duration: " + movie.getDuration() + " minutes"
                    + " Room: " + movie.getRoom().getRoomNumber()
                    + " Show Time: " + movie.getShowTime()
            );

        }
        System.out.println(Constants.LINES);
        Logger.getInstance().info("All movies info displayed");
    }

    public void showMovieSeating(Movie movie) {
        System.out.println("----- " + movie.getTitle() + " Seating -----");
        Seat[][] seats = movie.getSeats();
        int rows = movie.getRoom().getRows();
        int cols = movie.getRoom().getCols();

        // Print column numbers
        System.out.print("    "); // offset for row numbers
        for (int j = 1; j <= cols; j++) {
            System.out.printf("%3d", j);
        }
        System.out.println();

        // Print seats
        for (int i = 0; i < rows; i++) {
            System.out.printf("%3d ", i + 1); // row number
            for (int j = 0; j < cols; j++) {
                if (seats[i][j].isAvailable()) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }

        // Print screen
        int screenWidth = cols * 3; // 3 spaces per seat
        int padding = (screenWidth - 6) / 2; // 6 = length of "SCREEN"
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.println(Constants.SCREEN);

        Logger.getInstance().info("Seating displayed for movie: " + movie.getTitle());
    }

}
