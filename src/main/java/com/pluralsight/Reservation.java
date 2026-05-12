package com.pluralsight;

public class Reservation {

// we are storing information related to a guest stay.
    private String roomType;
    // is really a derive
    // private double Price;

    private int numberOfNights;
    private boolean isWeekend;


    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        // Price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

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
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    // derive or calculated getters
    public double getPrice() {
        if (this.roomType.equalsIgnoreCase("king")) {
            return 139.00;
        } else {
            return 124.00;


        }

    }
    public double getReservationTotal() {
        double total = this.getNumberOfNights() * this.getPrice();

        if (this.isWeekend()) {

            total = total + (total * .1);
        }
        return total;

    }
}