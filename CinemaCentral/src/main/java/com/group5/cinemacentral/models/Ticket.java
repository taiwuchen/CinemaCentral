// Ticket.java
package com.cinemacentral.models;

public class Ticket {
    private Long id;
    private User user;
    private Show show;
    private Seat seat;

    // Constructors
    public Ticket() {}

    public Ticket(Long id, User user, Show show, Seat seat) {
        this.id = id;
        this.user = user;
        this.show = show;
        this.seat = seat;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
