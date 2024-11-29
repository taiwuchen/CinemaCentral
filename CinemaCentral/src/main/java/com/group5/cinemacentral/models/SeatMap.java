package com.group5.cinemacentral.models;

public class SeatMap {
    private String seatNumber;

    public SeatMap(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Getters and Setters
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
