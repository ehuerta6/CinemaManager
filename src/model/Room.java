package model;

public class Room {

    private int roomNumber;
    private int rows;
    private int cols;
    private String type; // IMAX, 3D, Standard, VIP, 4DX.

    public Room(int roomNumber, int rows, int cols, String type) {
        this.roomNumber = roomNumber;
        this.rows = rows;
        this.cols = cols;
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public String getType() {
        return type;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void setType(String type) {
        this.type = type;
    }

}
