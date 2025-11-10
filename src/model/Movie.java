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

        // initialize seats as available
        for (int i = 0; i < room.getRows(); i++) {
            for (int j = 0; j < room.getCols(); j++) {
                this.seats[i][j] = new Seat(i + 1, j + 1, true);
            }
        }
    }

    public boolean bookSeat(int row, int number) {
        // validate bounds (rows/number are 1-based externally)
        if (row < 1 || row > room.getRows() || number < 1 || number > room.getCols()) {
            return false;
        }
        Seat seat = seats[row - 1][number - 1];
        if (seat == null) {
            return false;
        }
        synchronized (seat) { // small guard if multi-threaded access possible
            if (seat.isAvailable()) {
                seat.setAvailable(false);
                return true;
            } else {
                return false;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }

}
