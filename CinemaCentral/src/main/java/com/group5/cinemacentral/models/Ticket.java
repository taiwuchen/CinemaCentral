package com.group5.cinemacentral.models;

public class Ticket {
    private Long id;
    private ShowTime showTime;
    private SeatMap seatMap;
    private double price;

    public Ticket(Long id, ShowTime showTime, SeatMap seatMap, double price) {
        this.id = id;
        this.showTime = showTime;
        this.seatMap = seatMap;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }

    public SeatMap getSeatMap() {
        return seatMap;
    }

    public void setSeatMap(SeatMap seatMap) {
        this.seatMap = seatMap;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
