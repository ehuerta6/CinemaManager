package model;

public class Seat {

    private int row;
    private int number;
    private boolean isAvailable;

    public Seat(int row, int number, boolean isAvailable) {
        this.row = row;
        this.number = number;
        this.isAvailable = isAvailable;
    }
}
