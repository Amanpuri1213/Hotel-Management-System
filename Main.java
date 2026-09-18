package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        Payment payment = new Payment();

        while (true) {

            System.out.println("\n===== HOTEL MENU =====");

            System.out.println("1. Show Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    hotel.showRooms();

                    break;

                case 2:

                    hotel.showRooms();

                    System.out.print("Enter Room Number : ");

                    int roomNo = sc.nextInt();

                    Room room = hotel.searchRoom(roomNo);

                    if (room == null) {

                        System.out.println("Room Not Found.");

                    } else if (room.isBooked()) {

                        System.out.println("Already Booked.");

                    } else {

                        sc.nextLine();

                        System.out.print("Customer Name : ");

                        String name = sc.nextLine();

                        room.setBooked(true);

                        payment.makePayment(2000);

                        Filemanagement.saveBooking(name, roomNo);

                        System.out.println("Booking Successful.");

                    }

                    break;

                case 3:

                    System.out.print("Room Number : ");

                    int cancel = sc.nextInt();

                    Room r = hotel.searchRoom(cancel);

                    if (r != null && r.isBooked()) {

                        r.setBooked(false);

                        System.out.println("Booking Cancelled.");

                    } else {

                        System.out.println("Room not booked.");

                    }

                    break;

                case 4:

                    System.out.println("Thank You");

                    System.exit(0);

            }

        }

    }

}