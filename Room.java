package org.example;

public class Room {

    private int roomNo;
    private String category;
    private boolean booked;

    public Room(int roomNo, String category) {
        this.roomNo = roomNo;
        this.category = category;
        this.booked = false;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getCategory() {
        return category;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return roomNo + "  " + category + "  " +
                (booked ? "Booked" : "Available");
    }
}