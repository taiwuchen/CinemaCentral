// Seat.java
package com.cinemacentral.models;

public class Seat {
    private int seatNumber;
    private boolean occupied;

    // Constructors
    public Seat() {}

    public Seat(int seatNumber, boolean occupied) {
        this.seatNumber = seatNumber;
        this.occupied = occupied;
    }

    // Getters and Setters
    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
