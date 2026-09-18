package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Filemanagement {

    public static void saveBooking(String name, int roomNo) {

        try {

            FileWriter fw = new FileWriter("bookings.txt", true);

            fw.write(name + " booked Room " + roomNo + "\n");

            fw.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }

}