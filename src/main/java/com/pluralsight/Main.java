package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room myRoom = new Room(1, 50., false, false);
        System.out.println(myRoom.isAvailable());

        Reservation myReservation = new Reservation("king", 5, true);
        System.out.println(myReservation.getReservationTotal());

        Employee myEmployee = new Employee(
                "N131-O2",
                "Steve",
                "Donuts",
                20.,
                60.
        );
        System.out.println(myEmployee.getTotalPay());
    }
}
