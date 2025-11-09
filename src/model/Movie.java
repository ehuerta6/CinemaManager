package model;

public class Movie {

    private int id;
    private String title;
    private String genre;
    private int duration; // duration in minutes
    private Room room;
    private String showTime;
    private Seat[][] seats;

    public Movie(int id, String title, String genre, int duration, Room room, String showTime) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.room = room;
        this.showTime = showTime;
        this.seats = new Seat[room.getRows()][room.getCols()];
    }

}
