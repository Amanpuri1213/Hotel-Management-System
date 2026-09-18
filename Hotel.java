package org.example;

import org.example.Room;

import java.util.ArrayList;

public class Hotel {

    ArrayList<Room> rooms = new ArrayList<>();

    public Hotel() {

        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Standard"));
        rooms.add(new Room(201, "Deluxe"));
        rooms.add(new Room(202, "Deluxe"));
        rooms.add(new Room(301, "Suite"));

    }

    public void showRooms() {

        System.out.println("\nAvailable Rooms");

        for (Room r : rooms) {

            System.out.println(r);
        }

    }

    public Room searchRoom(int roomNo) {

        for (Room r : rooms)

            if (r.getRoomNo() == roomNo)

                return r;

        return null;

    }

}