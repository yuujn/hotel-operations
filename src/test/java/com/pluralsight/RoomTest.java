package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @Test
    void checkIn() {
        Room myRoom = new Room(1, 50., false, false);

        myRoom.checkIn();

        assertFalse(myRoom.isAvailable());
    }

    @Test
    void checkOut() {
        Room myRoom = new Room(1, 50., false, false);

        myRoom.checkIn();
        myRoom.checkOut();

        assertFalse(myRoom.isAvailable());
    }

    @Test
    void cleanRoom() {
        Room myRoom = new Room(1, 50., false, false);

        myRoom.checkIn();
        myRoom.checkOut();
        myRoom.cleanRoom();

        assertTrue(myRoom.isAvailable());
    }
}