package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        double price = switch (roomType.toLowerCase()) {
            case "king" -> 139.00;
            case "double" -> 124.00;
            default -> throw new RuntimeException("invalid roomType");
        };

        if (weekend) {
            price *= 1.1;
        }

        return price;
    }

    public double getReservationTotal() {
        return getPrice() * getNumberOfNights();
    }
}
